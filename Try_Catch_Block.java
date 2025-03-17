public class Try_Catch_Block {
    public static void main(String[] args) {
        int a=6;
        int b=0;
        try{
            int c=a/b;
        }
        catch(Exception e){
            System.out.println("We failed to divide Reason");
            System.out.println(e);
        }
        System.out.println("End of the problem");
    }
}
