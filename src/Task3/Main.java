package Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;


import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {
        String[] numbers = {"1, 2, 0", "4, 5"};

        String result = Arrays.stream(numbers)
                .flatMap(s -> Arrays.stream(s.split(",\\s*")))
                .map(Integer::parseInt)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }
}
