package Task3;

import java.util.Arrays;


import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,4,6,23,87,342,6,3,4,5};
        String result = Arrays.stream(numbers)
                .sorted()
                .mapToObj( String::valueOf)
                .collect(joining(", "));
        System.out.println(result);
    }
}
