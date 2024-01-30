package Task4;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        RandomAlgorithm randomAlgorithm = new RandomAlgorithm(25214903917l,11l,281474976710656l);
        Stream<Long> stream = Stream.iterate(0L,seed->randomAlgorithm.next((Long) seed));
        stream.limit(10).peek(System.out::println).collect(Collectors.toList());
    }
}
