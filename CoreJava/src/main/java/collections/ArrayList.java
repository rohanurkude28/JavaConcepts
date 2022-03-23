package collections;

import java.util.Collections;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String> arrayList = new java.util.ArrayList<>();
        //arrayList = Arrays.asList("Google","Microsoft","Amazon","Meta");
        
        arrayList.add("Google");
        arrayList.add("Microsoft");
        arrayList.add("Amazon");
        arrayList.add(3,"Meta"); // Need to give immediate next index
        arrayList.add("Goldman Sachs");
        arrayList.add("Walmart");
        arrayList.set(0, "Alphabet");
        arrayList.add("Credit Suisse");

        arrayList.remove("Dummy"); // Wont give error
        arrayList.remove("Walmart");
        arrayList.remove(5);

        arrayList.forEach(System.out::println);

        Collections.sort(arrayList);
        System.out.println("========After Sorting========");
        arrayList.forEach(System.out::println);


        System.out.println("========Operations========");
        System.out.println("Index of:  "+arrayList.indexOf("Alphabet")); // gives -1 if not found
        System.out.println("List Size: "+arrayList.size());
        System.out.println("List contains: "+arrayList.contains("Dummy"));

        System.out.println("========After splicing========");
        new java.util.ArrayList(arrayList.subList(3, arrayList.size())).forEach(System.out::println);

        arrayList.clear();
        System.out.println("========After Clearing========");
        System.out.println("List Size: "+arrayList.size());


    }
}
