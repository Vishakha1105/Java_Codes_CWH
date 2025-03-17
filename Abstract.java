abstract class Parent2{//Abstract class inheritance
    public Parent2(){
        System.out.println("I am constructor of base2");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child2 extends Parent2{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void greet2(){
        System.out.println("Good Afternoon");
    }
}
abstract class Child3 extends Parent2 {
    public void th(){
        System.out.println("i am good");
    }
}
public class Abstract {
    public static void main(String[] args) {
        //We cant make the object of the abstract class
        //Parent2 p=new Parent2();//Cant make objects if the abstract class
        Child2 c=new Child2();
        //Child3 c1=new Child3();

    }

}
