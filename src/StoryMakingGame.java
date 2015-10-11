import java.util.Scanner;
import java.util.ArrayList;

public class StoryMakingGame {
	public static String story = "";
	public static int numPlayers;
	public static int playerTurn = 0;
	public static int totalTurns;
	public static int currentTurn = 1;
	public static String directions;
	public static char badCon;
	public static char badVow;
	
	static ArrayList<String>storyList = new ArrayList<String>();
	static ArrayList<Integer> pointList = new ArrayList<Integer>();
	public static void main(String[] args) {
		//System.out.println(System.nanoTime());
		Scanner keybd = new Scanner(System.in);
		/*
		 * Allowing for the directions to be inerted 
		 */
		Directions D1 = new Directions(); 
		System.out.println(D1.getDirections()+"\n\n\n");
		
		
		System.out.println("Enter the number of players: ");	
		numPlayers = keybd.nextInt();
		totalTurns = 3 * numPlayers;
		for(int i = 0; i<=numPlayers; i++) {
			if(i == 0) {
				pointList.add(-1000);
			}
			else {
				pointList.add(0);
			}
		}
		//***Creates ch and points odjs
		Characters ch1 = new Characters();
		PointCount PC1 = new PointCount();
		Topics tp1 = new Topics(); 
		badCon = ch1.getCon();
		badVow = ch1.getVow();
		//***Prints out the topic
		
		
		int a = 1;
		
		//Do while until end game
		while(currentTurn<=totalTurns+1) {

			String sentence = "";
			if(playerTurn != 0) {
				System.out.println("TYPE EXIT TO QUIT GAME");
				System.out.println("Player " + playerTurn + " enter text: " + "\t\t\t\t\t\t\t\t\t\t" + "Don't use: " + badCon + " , " + badVow);
			}
			sentence = keybd.nextLine();
			storyList.add(sentence + ".");
			
			//provides the space to only see the line from above:
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n"); 
			//prints topic put 4 first player only
			if(a == 1){
				tp1.topics();
				System.out.println("\t\t\tTopic: " + tp1.getTopic());
				a++;
			}
			if(sentence.equalsIgnoreCase("exit")){
				currentTurn = 1000;
			}
			System.out.println(sentence);
			pointList.set(playerTurn,PC1.pointCount(sentence)+pointList.get(playerTurn));
			//******For testing uncomment below
			//check for points
			playerTurn++;
			currentTurn++;
			if(playerTurn>numPlayers) {
				playerTurn = 1;
			}
		} 
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println(getStory());
		System.out.println("  Leaderboard\n" + getLeaderboard());
		
	}
	public static String getStory(){
		for(int a = 0; a<storyList.size();a++){
			story += storyList.get(a)+ " ";
		}
		return story;
	}
	
	public static int getLargest(ArrayList<Integer> myList) {
		int largest = -1000;
		for(int i = 0; i<myList.size(); i++) {
			if(myList.get(i) > largest) {
				largest = myList.get(i);
			}
		}
		return largest;
	}


	public static String getLeaderboard() {
		ArrayList<Integer> pointListCopy = new ArrayList<Integer>(pointList);
		ArrayList<Integer> ldrbrd = new ArrayList<Integer>();
		ArrayList<Integer> playersRank = new ArrayList<Integer>();

		for(int i = pointList.size(); i>1; i--) {
			ldrbrd.add(getLargest(pointList));
			//System.out.println(getLargest(pointList));
			pointList.remove(pointList.indexOf(getLargest(pointList)));
		}

		for(int i = 0; i<pointListCopy.size()-1; i++) {
			//System.out.println(ldrbrd.get(i));
			pointListCopy.indexOf(ldrbrd.get(i));
			playersRank.add(pointListCopy.indexOf(ldrbrd.get(i)));
		}
		
		for (int i = playersRank.size()-1;i > -1;i--) {
			if (playersRank.indexOf(playersRank.get(i)) > -1 && 
				playersRank.indexOf(playersRank.get(i)) < i) {
				for (int n = 1;n < playersRank.size()+1;n++) {
					if (playersRank.indexOf(n) == -1) {
						playersRank.set(i,n);
					}
				}
			}
		}
		
		String leaderboard = new String();
		for (int i = 0;i < ldrbrd.size();i++) {
			leaderboard += i+1 + ") " + "Player " + playersRank.get(i) + ": " + ldrbrd.get(i) + " \n";
		}
		return leaderboard;
	}
	
}