import java.util.Scanner;
public class Specific_Exceptions_Handling {
    public static void main(String[] args) {
        int [] marks=new int[3];
        marks[0]=70;
        marks[1]=71;
        marks[2]=72;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array index:");
        int ind=sc.nextInt();
        System.out.println("Enter the Number you want to divide with:");
        int number=sc.nextInt();
        try{
            System.out.println("The value of array index entered is:" + marks[ind]);
            System.out.println(" The value of array-value/number is:"+marks[ind]/number);

        }
        catch(Exception e){
            System.out.println("Some exception occured:");
        }



    }
}
