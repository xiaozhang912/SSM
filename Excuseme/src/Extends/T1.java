package Extends;

public class T1 {
    public static void main(String[] args) {
        SubClass sub = new SubClass();
        sub.method();
    }
}
class SuperClass{
    void method(){
        System.out.println("this is a SuperClass");
        System.out.println("SuperClass over");
    }
}
class SubClass extends SuperClass{
    void method(){
        super.method();
        System.out.println("this is a SubClass");
        System.out.println("SubClass over");
    }
}
