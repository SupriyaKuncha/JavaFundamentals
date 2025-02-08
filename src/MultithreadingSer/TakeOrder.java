package MultithreadingSer;

public class TakeOrder extends Thread{
    public void run() {
        System.out.println("Taking order...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Order has been taken.");
    }

}
