package thread;

public class TestByRunable {
	public static void main(String[] args) {
		Say3 say3= new Say3();
		Say4 say4= new Say4();
		while(true) {
			new Thread(say3).start();
			new Thread(say4).start();
			
		}
	}
}

class Say3 implements Runnable{

	public void run() {
		while (true) {
			System.out.println(3);
		}
	}
	
}

class Say4 implements Runnable{

	public void run() {
		while (true) {
			System.out.println(4);
		}
	}
	
}