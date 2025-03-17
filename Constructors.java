class MyMainEmployee{
    private int id;
    private String name;
    //Constructors used in the method
    //Name of class and the name pf the constructors must be the same
     public MyMainEmployee(){
        id=45;
        name = "Your name here";
    }


    public MyMainEmployee(String myName){
        id=45;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name =n;

    }
    public int getId(){
        return id;
    }
    public int setId(){
        id=1;
        return id;
    }

}
public class Constructors{
    public static void main(String[] args) {
        //When we write the constructor with arguments we have to write the arguments to the obejcts of that constructors

        MyMainEmployee harry=new MyMainEmployee("Vishakha");
        //harry.setName("Codewithharry");
        //Constructor automatically invoked

        System.out.println(harry.getName());
        System.out.println(harry.getId());

        //We cant make every time new set id or set name so that we use thw concept of constructors


    }
}