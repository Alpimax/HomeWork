package SquareProject;

import java.util.*;

public class homeworkJava {
    //    @student Hey team, here is set of java interview questions as I promised:
    //I will ask one of them randomly in our weekly meeting.
    //Q1:Write a return method that can find the frequency of characters
    //
    //Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

    public static void frequencyOfChars(String str) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            String key = "" + str.charAt(i);
            if (!map.containsKey(key))
                map.put(key, 1);
            else {
                map.put(key, map.get(key) + 1);
            }
        }
        System.out.println(map);
    }

    //Q2:Write a return method that check if a string is build out of the same letters as another string.
    //
    //Ex:  same("abc",  "cab"); -> true
    //
    //same("abc",  "abb"); -> false

    public static boolean checkMethod(String first, String second) {

        return countFirst(first).equals(countFirst(second));
    }


    public static Map<String, Integer> countFirst(String str) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            String key = "" + str.charAt(i);
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }

        return map;
    }

    //Q3:Write a return method that can remove the duplicated values from String
    //
    //Ex:  removeDup("AAABBBCCC")  ==> ABC

    public static void removeDuplicate(String str){
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            String key = "" + str.charAt(i);
            if(!map.containsKey(key)){
                map.put(key,1);
            }else
                map.remove(key);
        }
        System.out.println(map.keySet());
    }

    public static void main(String[] args) {
        frequencyOfChars("AAABBCDD");

        System.out.println(checkMethod("badc", "abcd"));

        removeDuplicate("AAABBBCCC");

    }



//@student Besides that your other task is:
//Please prepare your own agile team and agile environment story.
//I will pick one of you to tell about it next week in our meeting.
}
