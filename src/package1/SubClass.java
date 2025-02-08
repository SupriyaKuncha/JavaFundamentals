package package1;


	public class SubClass extends BaseClass {
	    public SubClass() {
	        System.out.println("SubClass constructor");
	    }
	 
	    public void display() {
	        System.out.println(protectedField); 
	        displayProtected();
	    }
}