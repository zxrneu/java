package thread;

public class TestByThread {
	public static void main(String[] args) {
		SayOne one = new SayOne();
		SayTwo two = new SayTwo();
		while (true) {
			one.start();
			two.start();
		}
		
	}

}
