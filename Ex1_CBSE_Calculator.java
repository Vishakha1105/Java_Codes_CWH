import java.util.Scanner;
public class Ex1_CBSE_Calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr your phy marks:");
        int phy=sc.nextInt();
        System.out.println("Enetr your Eng marks:");
        int Eng=sc.nextInt();
        System.out.println("Enetr your Chem marks:");
        int Chem=sc.nextInt();
        System.out.println("Enetr your Math marks:");
        int Math=sc.nextInt();
        System.out.println("Enetr your CS marks:");
        int CS=sc.nextInt();

        float percentage=((phy+Chem+Eng+Math+CS)/500.0f)*100;

        System.out.println("Percentage is:");
        System.out.println(percentage);


    }
}
