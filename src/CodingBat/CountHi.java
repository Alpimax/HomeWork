package CodingBat;

public class CountHi {
    public static void main(String[] args) {

    }


    public   int method1(String str) {
        int count = 0;
        while (str.contains("hi")) {
            str = str.replaceFirst( "hi", "");
            count++;
        }
        return count;
    }
}