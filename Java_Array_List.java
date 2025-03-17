import java.lang.reflect.Array;
import java.util.*;

public class Java_Array_List {
    public static void main(String[] args) {
        //Below is generic syntax
        ArrayList<Integer> l1=new ArrayList<>();//Array list are modified group of array list
        l1.add(6);
        l1.add(4);
        l1.add(8);
        l1.add(5);
        l1.add(6);
        for(int i=0;i<l1.size();i++){//integaer hain isliye size()
            System.out.println(l1.get(i));

        }

    }
}
