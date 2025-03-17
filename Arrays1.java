import java.util.*;
public class Arrays1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int [size];

        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();//Taking array value as input and returning them as a output
        }

        for(int i=0;i<size;i++){
            System.out.println(numbers[i]);//When we take the size as any number then java takes array as all elements are zeros automatically
        }
    }

}
//Java initialise the value from zero
//integer=0
//float=0.00
//boolean=false
//string=" "


