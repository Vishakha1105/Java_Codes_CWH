
//Print the matrix
import java.util.*;
public class TwoDArrays {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();

        int [][] numbers=new int[rows][cols];
        //outer loop for rows
        for(int i=0;i<rows;i++){
            //inner loop for columns
            for(int j=0;j<cols;j++){
               numbers[i][j]= sc.nextInt();
            }
        }
        //Output
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
