package MultithreadingSer;

public class orderApp {

	public static void main(String[] args) {
        TakeOrder takeOrder = new TakeOrder();
        ProcessPayment processPayment = new ProcessPayment();
        AssignDA assignDeliveryAgent = new AssignDA();
 
        takeOrder.start();
        processPayment.start();
        assignDeliveryAgent.start();
        try {
            takeOrder.join(); 
            processPayment.join();
            assignDeliveryAgent.join();
        }  catch (InterruptedException e) {
            e.printStackTrace();
        }
      
    }

}
