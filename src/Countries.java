import java.util.*;

public class Countries {
    public static void main(String[] args) {

        // key - countries - String
        // value = cities - List<String>
        Map<String, List<String>> countries = new HashMap<>();
        countries.put("United States", new ArrayList<>(Arrays.asList("Chicago", "Dallas", "Irvine", "San Diego", "New York", "Philadelphia", "Madison")));

        System.out.println(countries);

        countries.get("United States").add("Seattle");
        System.out.println(countries);


    }
}
