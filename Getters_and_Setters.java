class MyEmployee{
    private int id;
    private String name;

    //make the methods to access the private variables data
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
public class Getters_and_Setters{
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
        //harry.id = 45;
       // harry.name = "CodeWithHarry";



    }
}
