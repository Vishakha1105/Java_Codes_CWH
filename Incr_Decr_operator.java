public class Incr_Decr_operator {
    public static void main(String args[]){
        int i=56;
        System.out.println(i++);//first use
        System.out.println(i);//now increment
        System.out.println(++i);//first increment
        System.out.println(i);//then use
        int a=45;
        int b=90;
        int c=++b;//first b is increment then it will use as a c
        System.out.println(c);

        //

        int y=7;
        int x=++y*8;
        System.out.println(x);
        char ch='a';
        System.out.println(ch++);
        System.out.println(ch);
        System.out.println(++ch);


    }
}
