package Collection;

import java.util.*;
public class Arr_List {
    public static void main(String[] args) {
        // class/Interface name <wrappercls(datatype)> obj_name = new Constructor<>();
        List<Integer> numbers = new ArrayList<>();

        java.util.ArrayList<String> words = new java.util.ArrayList<>();// (5) nu kudutha 5 elements initialize pannikalam apro venumna resize pannikalam
//add
        words.add("Apple");
        words.add("Bat");
        words.add("Car");
        words.add("Dog");

        System.out.println(words);
//get method
        System.out.println("Get method :" + words.get(2));
//set method
        words.set(2,"Curd");
        System.out.println(words);
        System.out.println("Get method :" + words.get(2));
//size to find length
        int size = words.size();
        System.out.println("Size:" + size);
        //remove
        words.remove(2);
        System.out.println(words);
        System.out.println(words.contains("Terv"));
        System.out.println(words.isEmpty());
        // words.clear();// to dlt all the collections
        words.add("Apple");
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Orange");
        System.out.println(words);
        System.out.println(fruits);
        words.removeAll(fruits);
        System.out.println(words);


    }
    
}
