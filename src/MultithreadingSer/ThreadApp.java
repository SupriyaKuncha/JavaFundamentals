package MultithreadingSer;

public class ThreadApp {

	public static void main(String[] args) {
		Counter objC = new Counter();
		
		TestThread2 t1 = new TestThread2();
		
		TestThread runnable = new TestThread();
		Thread t2 = new Thread(runnable);
		
		Thread t3 = new Thread(()->{
			for(int i =0; i<5;i++) {
				objC.incrementCount();
			}
		});
		
		Thread t4 = new Thread(()->{
			for(int i =0; i<4;i++) {
				objC.incrementCount();
			}
		});
		
//		t1.start();
//		t2.start();
		t3.start();
		t4.start();
		
		try {
//			t1.join();
//			t2.join();
			t3.join();
			t4.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(objC.getCount());
		System.out.println("Process complete");

	}

}
