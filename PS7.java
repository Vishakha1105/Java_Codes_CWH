class Circle{
    public int radius;
    Circle(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius=r;

    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle{
    Cylinder1(int r,int h){
        super(r);//It will take the radius of the circle
        System.out.println("I am Cylinder1 parameterized constructor.");
        this.height=h;

    }
    public int height;
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class PS7 {
    public static void main(String[] args) {
        //Question 1:
        Circle objc=new Circle(12);
        Cylinder1 obj=new Cylinder1(4,1);
    }
}
