package SquareProject;

import java.util.function.Predicate;

public class BuiltInExamples {
    public static void main(String[] args) {

        Predicate<Integer> isPrime = p -> {

            if(p < 2)return false;

            for(int i = 2; i < p/2; i++){
                if(p % i == 0){
                    return false;
                }
            }
            return true;
        };

        System.out.println(isPrime.test(8));
        System.out.println(isPrime.test(-4));
        System.out.println(isPrime.test(11));

    }
}
