package thread.InitThread;

public class SayOne extends Thread{
	@Override
	public void run() {
		while (true) {
			System.out.println("1");
		}
	}
}
