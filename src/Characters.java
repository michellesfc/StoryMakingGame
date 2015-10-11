public class Characters {
	
	
	public static Character getCon() {
		String consonants = "bcdfghjklmnpqrstvwxyz";
		return consonants.charAt((int)(Math.random()*21));
	}
	
	public static Character getVow() {
		String consonants = "aeiou";
		return consonants.charAt((int)(Math.random()*5));
	}
}