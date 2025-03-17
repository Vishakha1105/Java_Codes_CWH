class Base1 {

    Base1() {
        System.out.println("Meh ek Bsae class ka constructor hoon!");//Consrtuctor of Bsae1 class
    }

    Base1(int a) {
        System.out.println("Meh ek Bsae class ka constructor hoon with a value of x:!" + a);//Consrtuctor of Bsae1 class
    }

}
class Derived1 extends Base1{
    Derived1(){
        super(0);
        System.out.println("Meh Derived class ka constructor hoon!");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("Meh ek overloaded constructor of derived with value y:"+y);
    }

}

public class Constructors_in_Inheritance {
    public static void main(String[] args) {
       // Base1 b=new Base1();
       // Derived1 d=new Derived1();//Agr humne derived class ka constructor nhi banaya fir bhi woh base class ke constructor ko access krta hain!
        Derived1 d=new Derived1(4,9);

    }
}
