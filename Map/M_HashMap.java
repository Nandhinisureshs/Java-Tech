package Map;
import java.util.HashMap;
import java.util.Map;
public class M_HashMap {
    public static void main(String[] args) {

    HashMap<Integer, String>  details = new HashMap<>();
    //key value ah base panni insert pannu

    details.put(1001,"avis");
    details.put(1002,"bob");
    details.put(1003,"charlie");
    details.put(1000,"siva");

        System.out.println(details);

        System.out.println(details.get(1002));
        details.put(1003,"mkce");
        System.out.println(details);
        System.out.println(details.getOrDefault(2000,"Hello"));
        System.out.println(details);

        details.put(2000,details.getOrDefault(2000,"Hello"));
        details.putIfAbsent(2500,"Hello java");
        System.out.println(details);
        System.out.println(details.keySet());
        System.out.println(details.values());
        details.remove(1000);
        System.out.println(details);

        System.out.println(details.containsKey(1000));
        System.out.println(details.containsValue("bob"));

        for(Map.Entry<Integer, String> pair:details.entrySet()){
            System.out.println(pair.getKey() +" : "+pair.getValue());// individual pair ah access panna 
        }

    }
    
}
