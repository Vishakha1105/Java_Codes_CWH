class A{
    public int a;
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}
class B extends A{

    @Override

    public void  meth2(){
        System.out.println("I am method 2 of class B");
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
        A a =new A();
        a.meth2();
        //Method Overriding(Parameter list is different)
        B b = new B();
        b.meth2();

    }
}
