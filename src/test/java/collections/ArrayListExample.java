package collections;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<String>();
        list.add("Apurva");
        list.add("Ajinkya");
        list.add("Akshay");
        list.add("Apurva");

        System.out.println(list);
        list.add(0,"Students Name");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains("Apurva"));
    }
}
