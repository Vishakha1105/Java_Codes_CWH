public class Logical {
    public static void main(String args[]){
        boolean a=true;
        boolean b=false;
        if (a && b){
            System.out.println("y");
        }else{
            System.out.println("N");
        }
        if(a || b){
            System.out.println("y");
        }else{
            System.out.println("N");
        }
        if(a != b){
            System.out.println("y");
        }else{
            System.out.println("N");
        }
    }
}
