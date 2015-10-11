import java.util.Scanner;
import java.util.ArrayList;


public class Topics {
	
	private static String topic;
	
	public static void topics() {
		ArrayList<String> topics = new ArrayList<String>();
		
		//topics.add("Baby, Lock the Doors and Turn the Lights Down Low");
		//topics.add("We can light it up like...");
		topics.add("If I Only Had...");
		//topics.add("2 girls...");
		//topics.add("2 guys...");
		//topics.add("Timmy said don't go all the way down...");
		topics.add("That's what she said...");
		topics.add("Dat A$$...");
		//topics.add("#firstWorldProblems left me hanging when...");
		topics.add("#kimye...");
		topics.add("Wrecking ball....");
		topics.add("Milley Cyrus and I ...");
		//topics.add("The worst pick up line...");
		//topics.add("Best way to be a freeloader...");
		topics.add("My worst date was when...");
		topics.add("The most awk Awk \"HookUp\" was when...");
		//topics.add("The cutest person here is sitting...");
		//topics.add("I would love to get to know the girl ...");
		topics.add("I would love to go on a date with...");
		//topics.add("I can't believe the time I...");
		//topics.add("Why isn't this person dead yet...");
		topics.add("Why does it itch so mcuh...");
		topics.add("I love your mom's...");
		//topics.add("I want to see your mom's...");
		//topics.add("Don't put it all the way in...");
		topics.add("Why won't you stay down...");
		//topics.add("I'm never turned down...");
		topics.add("Don't drop that \"Dum Dum Dum\" ");
		topics.add("Twerk Team...");
		//topics.add("When we get it right...");
		
		topic = topics.get((int)(Math.random()*topics.size()));
	}
	
	public static String getTopic() {
		return topic;
	}
	
	public static void main(String[] args){
		topics();
		System.out.println(getTopic());
	}
	
}