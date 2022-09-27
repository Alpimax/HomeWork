import java.util.HashMap;
import java.util.Map;

public class CodingBat {

    public static void main(String[] args) {
//       map ({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
        Map<String, String> map = new HashMap<>(Map.of("a", "candy", "b", "carrot", "c", "meh", "d", "Megan"));

        if(map.containsKey("a") && map.containsKey("c") ){
            map.put("b",map.get("a"));
            map.remove("c");
        } else if (map.containsKey("a")){
            map.put("b",map.get("a"));
        }
        System.out.println(map);
    }

}
