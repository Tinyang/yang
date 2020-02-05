package study.newFeature.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 100 ; i++) {
            list.add(i);
        }
        Stream<Integer> sequentialStream = list.stream();
        Stream<Integer> seqFilteredStream = sequentialStream.filter(p1 -> p1 > 90).map(p -> p += 1);
        seqFilteredStream.forEach(p -> System.out.println("sequence" + p));

        Stream<Integer> parallelStream = list.parallelStream();
        Stream<Integer> parallelFilteredStream = parallelStream.filter(t -> t > 90);
        parallelFilteredStream.forEach(c-> System.out.println("parallel" + c));

    }
}
