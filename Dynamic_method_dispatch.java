class One{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void name(){
        System.out.println("My name is java");
    }
}
class Two extends One{
    public void swagat(){
        System.out.println("Apka Swagat hain!");
    }
    public void name(){
        System.out.println("My name is  Java in class two");
    }
}
public class Dynamic_method_dispatch {
    public static void main(String[] args) {
        //One obj=new One();
        //Two obj1=new Two();

        One obj=new Two();//Reference is of super class and object is of sub class
        obj.greet();
        //Run time polymorphism(Object is made at the time of run time of the code)
        obj.name();//Actual object is created of Class Two
        //One obj=Reference
        //new Two()=Actual Object
        //Two obj1=new One();//Not Allowed
        //obj.name();


    }
}
