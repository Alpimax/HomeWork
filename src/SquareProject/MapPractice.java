package SquareProject;


import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {

        Map<String, Double> map = new HashMap<>();
        map.put("Jamil", 165000.0);
        map.put("Baz", 145000.0);
        map.put("Alper", 135000.0);
        map.put("Jose", 130000.0);
        String highestSalary = "";
        String lowestSalary = "";

        for (Map.Entry<String, Double> eachEntry : map.entrySet()) {
            double max = eachEntry.getValue();
            double min = eachEntry.getValue();

            for (double each : map.values()) {
                if (each < min) {
                    min = each;

                } else if (each > max) {
                    max = each;
                }
            }

            if(eachEntry.getValue()==max){
                highestSalary = eachEntry.getKey();
            }
            if(eachEntry.getValue()==min){
                lowestSalary = eachEntry.getKey();
            }
        }

        System.out.println(highestSalary);
        System.out.println(lowestSalary);
    }

}