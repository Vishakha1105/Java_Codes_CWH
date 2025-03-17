public class Var_aegs {
    /*static int sum(int a , int b ,int c){//These are method created
        return a+b*c;
    }*/
    //No need to create seperate methods every time ,instead of that we create variable arguments concpet
    static int sum(int ...arr){
        //Available as int []arr;
        int result=0;
        for(int a: arr){
            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {

        System.out.println("Welcome to varargs tutorial");
        System.out.println("The result of return method:"+ sum(4,5,9));
        System.out.println("The sum of nothing is:"+sum());
    }
}
//Sometimes some arguments are compulsory.We have to give the value to them to run the after operation.