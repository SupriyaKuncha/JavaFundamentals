package package2;

import package1.GrandChildClass;

public class GrandChildClassInPackage2 extends GrandChildClass {
    public GrandChildClassInPackage2() {
        System.out.println("GrandChildClassInPackage2 constructor");
    }
 
    public void display() {
        
        System.out.println(protectedField);  
        displayProtected();
    }
}
