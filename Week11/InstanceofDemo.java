package Week11;

public class InstanceofDemo {
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        Object c = new C();
        System.out.println(a instanceof A);
        System.out.println(b instanceof B);
        System.out.println(b instanceof A);
        System.out.println(a instanceof B);
        System.out.println(c instanceof C);
        System.out.println(c instanceof A);
        System.out.println(c instanceof B);
    }
}
class A{

}
class B extends A{

}
class C{
}
