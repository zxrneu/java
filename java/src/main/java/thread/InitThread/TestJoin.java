package thread.InitThread;

public class TestJoin {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				int i=0;
				while (i++<500 ) {
					System.out.println(i);
					
				}
			}
		});
		t1.start();
		for (int i = 0; i < 500; i++) {
			
			System.out.println(Thread.currentThread().getName()+i);
		}
		t1.join(); //t1线程加入到main线程中来，只有t1线程运行结束，才会继续往下走
		/*
		 * • join 方法 : 源码实现在下方,可以看到只要thread存活的情况下就会某个时间内循环一个等待的方法 (注意这个方法和下面的wait
		 * 方法不是一回事,下面的wait方法会一直阻塞在那里, 进入这个状态后，是不能自动唤醒的，
		 * 必须依靠其他线程调用notify()或notifyAll()方法才能被唤醒.),
		 * 使用场景是例如某个操作执行前需要执行一个加载资源的任务,那么执行的这个操作就要一直等待加载的操作完成以后才可以执行(join(0))
		 */
	}

}
