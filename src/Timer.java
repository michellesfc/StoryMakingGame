
public class Timer {
	
	public static void main(String[] args) {
		long tStart = System.currentTimeMillis();
		while (System.currentTimeMillis() < tStart+3000) {
		}
			System.out.println("3 seconds left!");
		while (System.currentTimeMillis() < tStart+5000) {
		}
		System.out.println("it worked!");
	}
	
}