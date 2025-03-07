package Array_List;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> languages= new ArrayList<>();
        languages.add("C");
        languages.add("C#");
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("Go");
        languages.add("React");

        languages.remove(2); //3. eleman silindi

        languages.set(4, "Vue");
        System.out.println(languages); //set ederek 5.eleman değişti.

        String eleman = languages.get(2);
        System.out.println(eleman); // get ederek 3.eleman yazdırıldı.

    }
}
