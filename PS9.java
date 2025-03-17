class Practice13a extends Thread{
    public void run(){
        while(true){
        System.out.println("Good morning");
        }
    }
}
class Practice13b extends Thread{
    public void play(){
        while(true){
            System.out.println("Welcome");
        }
    }
}
public class PS9 {
    public static void main(String[] args) {
        Practice13a p1=new Practice13a();
        Practice13b p2=new Practice13b();
        p1.run();
        p2.play();



    }
}
