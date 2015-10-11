import java.util.Scanner;
import java.util.ArrayList;
public class PointCount extends StoryMakingGame{
	public static int points;
	
	public static String nextWord(String s){
		int A1 = s.indexOf(" ");
		if(s.indexOf(" ") == -1){
			return s;
		}
			return s.substring(0,A1);
	}	
		
	public static int pointCount(String sentence) {
		String newSentence = sentence.toLowerCase();; 
		points = 0;
		while(newSentence.length()>0) {
			String first = nextWord(newSentence);
			if (first.indexOf(badVow)!=-1) {
				points -= 5;
			}
			if(first.indexOf(badCon)!=-1) {
				points -= 5;
			}
			if(first.indexOf(badCon) ==-1 && sentence.indexOf(badVow)==-1) {
				points += 10;
			}
			newSentence = newSentence.substring(first.length()).trim();
		}
		return points;
	}
		
}
