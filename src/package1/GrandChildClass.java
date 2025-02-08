package package1;

public class GrandChildClass extends SubClass {
    public GrandChildClass() {
        System.out.println("GrandChildClass constructor");
    }
 
    public void display() {
        
        System.out.println(protectedField); 
        displayProtected(); 
    }
}
