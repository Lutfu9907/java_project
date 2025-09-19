package Collections_Generics;

import java.util.ArrayList;
import java.util.HashMap;

class Ogrenciler {
    ArrayList<String> ogrenciListesi = new ArrayList<>();
    HashMap<Integer, String> ogrenciMap = new HashMap<>();

    public Ogrenciler() {
        ogrenciListesi.add("Ali");
        ogrenciListesi.add("Veli");
        ogrenciMap.put(1, "Ayse");
        ogrenciMap.put(2, "Fatma");
    }

    class Box<T> {
        private T value;

        public void setValue(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Ogrenciler ogrenciler = new Ogrenciler();
        for (String ogrenci : ogrenciler.ogrenciListesi) {
            System.out.println(ogrenci);
        }
        for (Integer key : ogrenciler.ogrenciMap.keySet()) {
            System.out.println(key + ": " + ogrenciler.ogrenciMap.get(key));
        }

        Ogrenciler.Box<String> stringBox = ogrenciler.new Box<>();
        Ogrenciler.Box<Integer> integerBox = ogrenciler.new Box<>();

        stringBox.setValue("Merhaba");
        integerBox.setValue(12);

    }
}