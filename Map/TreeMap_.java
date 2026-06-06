package Map;
import java.util.*;
public class TreeMap_ {
    public static void main(String[] args) {
        

        TreeMap<Integer, String> details = new TreeMap<>();
        //ascending order sort panni print pannu
        details.put(10,"hello");
        details.put(5,"terv");
        details.put(1,"java");
        details.put(7,"mkce");
        
        System.out.println(details);

        LinkedHashMap<Integer, Integer> numbers = new LinkedHashMap<>();
        //same order la print pannu
        numbers.put(12,36);
        numbers.put(1,8);
        System.out.println(numbers);
    }
    
}