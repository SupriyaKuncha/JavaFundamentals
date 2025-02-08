package package2;

import package1.SubClass;

public class SubClassInPackage2 extends SubClass {

    public void display() {

        System.out.println(protectedField); 
        displayProtected();  
    }
}
