public class Finally_Block {
    public static void main(String[] args) {
        try{
            int a=5;
            int b=0;
            int c=a/b;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("End of the program");
        }
    }
}
