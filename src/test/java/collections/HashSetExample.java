package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set =new HashSet<String>();
        set.add("Apurva");
        set.add("Ajinkya");
        set.add("Akshay");
        set.add("Apurva");
        set.add("Test");
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        set.remove("Test");
        System.out.println(set);

        Iterator<String> itr =set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
