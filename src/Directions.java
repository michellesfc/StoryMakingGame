import java.util.ArrayList;
import java.util.Scanner;

public class Directions{
	
	public static String  Directions;
	
	public static void main(String[] args){
		System.out.println(getDirections());
	
	}	
	
	public static String getDirections(){
		String  Name = "\t\t\t\t\t GAME-NAME: \"Say What You Need To Say\"\n";
		
		Directions = "\t\t\t\t Hello and Welcome to our game created at \"CodeDaySF\"" +
				"\n" +
				"\t\t\t\t\t\t How does it work:"+
				"\n\t\t\t\tEach player will add one sentence to a topic generated by US!" + 
				" \n\t\tEach player only gets to see the previous sentence and must add  their next sentence to the story. " +
				" \n\t\tEach player will get 3 turns to add to the story, but here's the catch you CANNOT use a particular" +
				" \n\t\t\t\tConsonant and vowel each round, which will be generated by US!" +
				" \n\t\tIf your words contain these restricted letters then you will get points DEDUCTED." +
				" \n\t\t\t\t\tYou EARN points for longer sentences!!"+
				" \n\t\t\t\t\t     Lastly remember to have fun:";
		
		return Name + "\n"+Directions;
	}
	
}