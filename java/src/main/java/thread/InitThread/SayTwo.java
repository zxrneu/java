package thread.InitThread;

public class SayTwo extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("2");
		}
	}
}
