import java.util.*;
//Que:Take an array as input from user.Search for a given number x and print the index at which it occurs.
public class Array2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];

        //input
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        int x=sc.nextInt();

        //output

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==x){
                System.out.println("x found at index:"+i);
            }
        }
    }
}
