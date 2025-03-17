import java.util.*;

public class Input1 {
    public static void main(String args[]){
        //Input from user
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>18){
            System.out.println("Adult");
        }else{
            System.out.println("Not Adult");
        }



    }
}
