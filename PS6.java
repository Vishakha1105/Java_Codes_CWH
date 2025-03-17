class Cylinder{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;

    }
    public double surfaceArea() {
        return 2* Math.PI* radius* radius + 2* 3.142* radius* height;
    }
    public double volume() {
        return Math.PI* radius* radius * height;
    }
}
public class PS6 {
    public static void main(String[] args) {

        //Question 1:All about Cylinder:

        Cylinder myCylinder=new Cylinder();//Object Creation
        //For height
        myCylinder.setHeight(12);
        int h=myCylinder.getHeight();
        System.out.println("Height of the cylinder is:"+h);
        //For radius
        myCylinder.setRadius(4);
        int r=myCylinder.getRadius();
        System.out.println("Radius of the Cylinder is:"+r);

        //Question 2:Surface area
        System.out.println("The Surface area of the cylinder is:"+myCylinder.surfaceArea());

        //Question 3:Volume
        System.out.println("The Volume of the Cylinder:"+myCylinder.volume());

        //Question 4:

    }
}
