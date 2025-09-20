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
    public void addStudent(){
        ogrenciListesi.add("Ahmet");
        ogrenciMap.put(3, "Zeynep"); 
    }
    public void removeStudent(){
        ogrenciListesi.remove("Veli");
        ogrenciMap.remove(2); 
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

        for (int i = 0; i < ogrenciler.ogrenciListesi.size(); i++) {
            System.out.println(i + " -> " + ogrenciler.ogrenciListesi.get(i));
        }
        for (Integer key : ogrenciler.ogrenciMap.keySet()) {
            System.out.println(key + ": " + ogrenciler.ogrenciMap.get(key));
        }

        Ogrenciler.Box<String> stringBox = ogrenciler.new Box<>();
        Ogrenciler.Box<Integer> integerBox = ogrenciler.new Box<>();
       
        stringBox.setValue("Merhaba");
        integerBox.setValue(12);

        ogrenciler.addStudent();
        ogrenciler.removeStudent();
        
        for (int i = 0; i < ogrenciler.ogrenciListesi.size(); i++) {
            System.out.println(i + " -> " + ogrenciler.ogrenciListesi.get(i));
        }
        for (Integer key : ogrenciler.ogrenciMap.keySet()) {
            System.out.println(key + ": " + ogrenciler.ogrenciMap.get(key));
        }
    }
}

// HashMap nedir?
// HashMap<K, V> → "anahtar" (key) ve "değer" (value) ikilisini saklar.
// Key → benzersiz olmalı (tekrar edemez).
// Value → aynı olabilir (tekrar edebilir).
// Index yoktur, bu yüzden for (Integer key : map.keySet()) gibi dolaşırız.

// HashMap<Integer, String> ogrenciler = new HashMap<>();
// ogrenciler.put(1, "Ali");
// ogrenciler.put(2, "Ayşe");

// Key=1, Value="Ali"

// Generics nedir?
// <> içindeki tip parametresi.
// Amaç: derleme zamanında tip güvenliği.
// Yani ArrayList<String> dediğinde, içine sadece String koyabilirsin.
// Cast gerekmez, çünkü tip zaten belli.

// ArrayList<String> isimler = new ArrayList<>();
// isimler.add("Ali");   // ✅
// isimler.add(123);     // ❌ Hata: sadece String kabul eder

// class Box<T> {
//     private T value;
//     public void setValue(T value) { this.value = value; }
//     public T getValue() { return value; }
// }

// Burada T → hangi tipi verirsen, onunla çalışır.
// Box<String> kutu = new Box<>(); → sadece String alır.
// Box<Integer> kutu2 = new Box<>(); → sadece Integer alır.

//********************************************

// Cast (Türkçede "tip dönüşümü")
// Java’da bir değişkenin tipini başka bir tipe dönüştürmek için kullanılan işlemdir.

// Object obj = "Merhaba"; 
// String s = (String) obj; // buradaki (String) = cast işlemi

//Burada obj aslında bir String, ama tip olarak Object görünüyor. 
//Java derleyicisi obj’yi otomatik olarak String kabul etmez, biz (String) diyerek ona “ben eminim bu bir String” deriz.
//İşte buna cast denir.
