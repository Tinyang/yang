package study.newFeature.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Learning {

    public static void main(String[] args) {
        Runnable r1 = () -> {
            System.out.println("Learning.main");
            if (1 != 2) {
                System.out.println("Learning.main2");
            }
        };
        new Thread(r1).start();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        Predicate<Integer> predicate = p -> p > 10;

        System.out.println(sumWithCondition(numbers,predicate));
        //System.out.println(findSquareOfMaxOdd(numbers));
        System.out.println(findSquareOfMaxOdd2(numbers));
    }

    private static boolean isPrime(int number) {
        return number > 1
                && IntStream.range(2, number).noneMatch(
                index -> number % index == 0);
    }


    //Traditional approach
    private static boolean isPrime2(int number) {
        if(number < 2) return false;
        for(int i=2; i<number; i++){
            if(number % i == 0) return false;
        }
        return true;
    }

    public static int sumWithCondition(List<Integer> numbers, Predicate<Integer> predicate) {
        return numbers.parallelStream()
                .filter(predicate)
                .mapToInt(i -> i + 1)
                .sum();
    }

    private static int findSquareOfMaxOdd(List<Integer> numbers) {
        int max = 0;
        for (int i : numbers) {
            if (i % 2 != 0 && i > 3 && i < 11 && i > max) {
                max = i;
            }
        }
        return max * max;
    }

    private static int findSquareOfMaxOdd2(List<Integer> numbers) {
        return numbers.stream().filter(p -> p % 2 != 0 && p > 0).max((o1, o2) -> o1 - o2).map(p -> {return p * p;}).get();
    }

}
