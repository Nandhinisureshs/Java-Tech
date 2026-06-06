import java.util.LinkedHashSet;
import java.util.TreeSet;
public class LinkedHS {
    public static void main(String[] args) {
        
        LinkedHashSet<String> movies = new LinkedHashSet<>();
        //yentha order la insert pannamo antha order tha print agum atha LHS(linkedhashset)
        movies.add("96");
        movies.add("Leo");
        movies.add("veeram");
        movies.add("Karuppu");
        movies.add("with love");

        System.out.println(movies);

        TreeSet<String> games = new TreeSet<String>();
        //sorted order
        games.add("Free fire");
        games.add("God of war");
        games.add("Cricket");
        games.add("Carrom");

        System.out.println(games);

    
    }
    
}
