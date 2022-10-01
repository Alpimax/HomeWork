import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DataBaseExample {
    public static void main(String[] args) {


        Map<String, String> person1 = new HashMap<>();
        person1.put("FIRST_NAME", "James");
        person1.put("LAST_NAME", "Bond");
        person1.put("AGE", "40");
        person1.put("ADDRESS", "131 PARK DRIVE, LONDON");

        firstSwap(new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"});
//                              ay", "by", "ax", "bx", "ai", "aj", "bx", "by"
    }
    public static String[] firstSwap(String[] strings) {
        Map<String,Integer> map = new HashMap<>();
        Map<String,String > map2 = new HashMap<>();

        for(int i =0;i<strings.length;i++){
            String letter =strings[i].substring(0,1);
            if(!map.containsKey(letter)){
                map.put(letter,i);
            }else if (map.containsKey(letter)&& !map2.containsKey(letter)){
                int first = map.get(letter);
                String save = strings[first];
                strings[first] = strings[i];
                strings[i] = save;
                map2.put(letter,letter);
                map.remove(letter);

            }
        }
        System.out.println(Arrays.toString(strings));
        return strings;
    }



}
