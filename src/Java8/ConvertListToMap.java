package Java8;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertListToMap {

    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,5,7,3,5,6,1,4,8,9);

        // convert to map  as a duplicate keys and number of occurrence will be value;

        list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((key, value) -> System.out.println(key + ":" + value));


        list.stream().collect(Collectors.toMap(Function.identity(),ele->1 , Integer::sum)).entrySet().stream().filter(entry -> entry.getValue() > 1)
                .forEach((val) -> {
                    System.out.println(val.getKey());
                });
    }
}
