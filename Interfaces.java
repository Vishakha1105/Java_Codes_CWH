interface Bicycle{
    int a=45;
    void applyBreak(int decrement);
    void speedUp(int increment);
}
class AvonCycle implements Bicycle{
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBreak(int decrement){
        System.out.println("Applying break");
    }
    public void speedUp(int increment){
        System.out.println("Applying speedup");
    }
}

// all methods in interfaces must be public

public class Interfaces {
    public static void main(String[] args) {
        AvonCycle cycleHarry=new AvonCycle();
        cycleHarry.applyBreak( 1);
        //You can create properties in interface
        System.out.println(cycleHarry.a);
        //You cannot modify because its final value
    }
}
