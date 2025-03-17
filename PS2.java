import java.util.Scanner;
public class PS2 {
    public static void main(String args[]){
        //Question 1:Result of expression
        float a=7/4.0f * 9/2.0f;
        System.out.println(a);

        //Question 2:
        char grade='B';
        //Incrypting a grade
        grade=(char)(grade+8);//only grade+8 can convert to int but we want in char so we attach their char
        System.out.println(grade);
        //Decrypting a grade
        grade=(char)(grade-8);
        System.out.println(grade);

        //Question:3
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(x>8);

        //Question 4:
        //(v*v-u*u)/(2*a*s)

        //Question 5:
        int y=7;
        int k=7*49/7+35/7;
        System.out.println(k);
    }
}
