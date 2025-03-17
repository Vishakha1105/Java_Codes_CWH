import java.util.Scanner;
public class Elseif {
    public static void main(String[] args) {
        System.out.println("Enter your age:");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        if(age>56){
            System.out.println("You are experienced");
        }else if(age>46){
            System.out.println("You are semi-experienced");
        }else if(age>36){
            System.out.println("You are sem-semi-experienced");
        }else{
            System.out.println("You are not experienced");
        }


    }
}
