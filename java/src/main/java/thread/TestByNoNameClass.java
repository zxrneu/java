package thread;

public class TestByNoNameClass {
	public static void main(String[] args) {
		while (true) {
			
			new Thread(new Runnable() {
				
				public void run() {
					while (true) {
						System.out.println(1);
					}
					
				}
			}).start();
			new Thread(new Runnable() {
				
				public void run() {
					while (true) {
						System.out.println(2);
					}
					
				}
			}).start();
		}
		
		
	}

}
