package Task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> streamA = Stream.of("gjfdjv","fsad","sdsd","dsd","dfs","vdvss");
        Stream<String> streamB = Stream.of("22","452","34","3432");
        Stream<String> result = zip(streamA, streamB);
        result.peek(System.out::println).collect(Collectors.toList());
    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        List<T> result = new ArrayList<>();
        Iterator<T> iteratorA = first.iterator();
        Iterator<T> iteratorB = second.iterator();

        while (iteratorA.hasNext()&&iteratorB.hasNext()){
            result.add(iteratorA.next());
            result.add(iteratorB.next());
        }
        return result.stream();
    }
}
