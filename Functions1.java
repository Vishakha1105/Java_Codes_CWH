//import java.util.*;
//Sum of Two numbers using functions
//public class Functions1{
//public static int calculateSum(int a,int b){
// int sum = a+b;
//return sum;

//}
// public static void main(String args[]){
//Scanner sc=new Scanner(System.in);
//int a=sc.nextInt();
//int b=sc.nextInt();

//int sum=calculateSum(a,b);
//System.out.println("The Sum of two numbers is:"+sum);
//}
//}

import java.util.*;
//Make a functions to multiply two numbers and return the product
public class Functions1{
    public static int calculateProduct(int a,int b){
        return a*b;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int product=calculateProduct(a,b);
        System.out.println("Product of two numbers is:"+product);
    }
}
