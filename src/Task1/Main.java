package Task1;

import java.util.ArrayList;
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
        namesList = unpairedIndexName(namesList);
        System.out.println(namesList);
    }
    public static List<String> unpairedIndexName(List<String> names){
        List<String> unpairedNameList = names.stream()
                .filter(name -> names.indexOf(name)%2 == 0 )
                .collect(Collectors.toList());
        return unpairedNameList;
    }
}
