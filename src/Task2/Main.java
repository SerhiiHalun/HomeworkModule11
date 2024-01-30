package Task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>();
        namesList.add("Serhii");
        namesList.add("Kirill");
        namesList.add("Dimitry");
        namesList.add("Ivan");
        namesList.add("Andrew");
        namesList.add("Alex");

        System.out.println(namesList);
        namesList = upperAndSortedName(namesList);
        System.out.println(namesList);
    }
    public static List<String> upperAndSortedName(List<String> words){
        List<String> result = words.stream().map(word -> word.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        return result;

    }
}