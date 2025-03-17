public class PS4 {
    public static void main(String[] args) {
        //Question 1:Find the sum
        float [] marks={98.0f,97.7f,96.5f,95.5f,94.4f};
        float sum=0;

         for(float element:marks){
             sum=sum+element;
         }
        System.out.println("The value of sum is:"+sum);

         //Question 2:Find the given number is present or not
        float [] marks1={98.0f,97.7f,96.5f,95.5f,94.4f};
        float num = 95.5f;
        boolean isInArray=false;

        for(float element:marks1){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in the array");
        }else{
            System.out.println("The value is absent");
        }

        //Question 3:Find the Average
        float [] marks2={98.0f,97.7f,96.5f,95.5f,94.4f};
        float sum1=0;

        for(float element:marks2){
            sum1=sum1+element;
        }
        System.out.println("The value of Average is:"+sum1/marks2.length);


        //Question 4:Create a java program to add two matrices in the format of the 2 by 3
        int [][] mat1 = {{1,2,3},
                         {4,5,6}};

        int [][] mat2 = {{5,2,3},
                         {7,5,6}};

        int [][] result = {{0,0,0},
                           {0,0,0}};

        for(int i=0;i<mat1.length;i++){//row number of times
            for(int j=0;j<mat1[i].length;j++){//column number of times

                result[i][j]=mat1[i][j]+mat2[i][j];//Update first the matrix of result
                System.out.print(result[i][j] + " ");//Then print the result of the matrix

            }
            System.out.println(" ");

        }


    }
}
