class Base{
    int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
        System.out.println("I am setting x now.");
    }
    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class derived extends Base{
    int y;
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
        System.out.println("I am setting y.");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        /*Base b=new Base();
        b.setX(4);
        System.out.println(b.getX());
        */

        //We have made objects of derived class but still we are using setx and getx methods of base class.
        //We can use the derived class for the given one
        //jab tak public hain tab tak hum sab access kar skte hain!
        //We cant accesss y becoz here we have defined x in base class
        derived b=new derived();
        b.setX(4);
        System.out.println(b.getX());

        Base d=new Base();
        d.setX(5);
        System.out.println(d.getX());

        derived c=new derived();
        c.setY(13);
        System.out.println(c.getY());
    }
}
