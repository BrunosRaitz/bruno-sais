import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class exemplo1 {

    public static void main(String[] args) {

        List<Integer> idades = new ArrayList<>();

        idades.add(21);
        idades.add(13);
        idades.add(32);
        idades.add(44);
        idades.add(18);
        idades.add(29);

        System.out.println(idades);

        System.out.println(idades.contains(25));

        System.out.println(idades.indexOf(18));

        System.out.println(idades.getLast());
        
    }
}
