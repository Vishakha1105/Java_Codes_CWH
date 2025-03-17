class Eclass{
    int a;

    public int getA(){
        return a;
    }

    Eclass(int v) {//Constructor
        this.a = v;//this is reference to current object.

    }
    public int returnone(){//Method
        return 1;
    }
}
class Dclass extends Eclass{
    Dclass(int c){
        super(c);
        System.out.println("Meh ek constructor hoon!");
    }
}
public class This_Super_Keyword {
    public static void main(String[] args) {
        Eclass e=new Eclass(85);//Object
        System.out.println(e.getA());
        Dclass d=new Dclass(5);
    }
}
