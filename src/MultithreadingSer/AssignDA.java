package MultithreadingSer;

public class AssignDA extends Thread{
    public void run() {
        System.out.println("Assigning delivery agent...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Delivery agent assigned.");
    }

}
