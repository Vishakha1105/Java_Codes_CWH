class c1{
    public int x=5;//public
    protected int y=45;//protected
    int z=6;//no modifier
    private int a=78;//private
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }

}
public class Access_Modifiers {
    public static void main(String[] args) {
        c1 c=new c1();
        c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        //System.out.println(c.a);//private cant used in same package
    }
}
