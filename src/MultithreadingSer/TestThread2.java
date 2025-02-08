package MultithreadingSer;

public class TestThread2 extends Thread{
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread is running from Thread class: " + Thread.currentThread().getName());
	}

}
