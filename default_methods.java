interface MyCamera{
    void takeSnap();
    void recordVideo();
}
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(long phoneNumber){
        System.out.println("Calling number"+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting");
    }

    //void takeSnap(){
      // System.out.println("Taking Snap");
   // }
}

public class default_methods {
}
