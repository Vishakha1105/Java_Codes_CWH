class Employee{
    int id;
    String name;

    //Method in class Employee

    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("and my name is "+name);

    }
}


public class Custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class.");
        Employee Vishakha=new Employee();//Object creation(Instantiating a new employee object)
        //Setting Attributes or properties
        Vishakha.id=12;
        Vishakha.name="CodeWithVishakha";
        System.out.println(Vishakha.id);
        System.out.println(Vishakha.name);

        Vishakha.printDetails();//Above method call and object creation is done

    }
}
