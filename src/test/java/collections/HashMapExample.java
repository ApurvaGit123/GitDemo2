package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer,String> map =new HashMap<Integer,String>();
        map.put(0,"Apurva");
        map.put(1,"Ajinkya");
        map.put(3,"Shane");
        map.put(4,"Test");

        System.out.println(map);
        map.remove(4);
        System.out.println(map);

        //converting map to set and printing key and values for it

        Set set =map.entrySet();
        Iterator itr =set.iterator();
        while(itr.hasNext()){
            Map.Entry map1 =(Map.Entry)itr.next();
            System.out.println(map1.getKey());
            System.out.println(map1.getValue());
        }

    }
}
