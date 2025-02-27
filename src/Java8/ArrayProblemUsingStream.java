package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayProblemUsingStream {

    public static void main(String[] args) {

        int [] arr = {2,3,5,4};
        List<Integer> list = Arrays.stream(arr).filter(ele -> ele > 0).sorted().distinct().boxed().toList();
        int output = IntStream.rangeClosed(1, list.size()+1).filter(i -> !list.contains(i)).findFirst().orElse(0);

        System.out.println(output);

        // nth Largest element in an array
        int[] a1 = {4,7,3,9,12};
       List<Integer> integers =  Arrays.stream(a1).boxed().sorted(Comparator.reverseOrder()).toList();

       int n = 3;

        System.out.println(integers.get(n - 1));

        //boxed() is used to convert the array object into the stream


        findDuplicateFromArray();

        findLargestAndSmallest();

        moveZeroToEnd();


    }

    private static void moveZeroToEnd() {

//        System.out.println("moveZeroToEnd");
//        List<Integer> arr = List.of(1,0,4,2,0,0,5,0,3,0);
//
//        List<Integer> integers =  arr.stream().filter(i -> i != 0).toList();
//
//
//        Stream.concat(integers.stream(),)
//
//        int[] newArr = Arrays.stream(arr).filter(i -> i > 0).toArray();
//        long zeroCount = Arrays.stream(arr).filter(i -> i ==0).count();



//        int[] allZeorAtEnd = IntStream.concat(Arrays.stream(newArr), Arrays.stream(new int[(int)zeroCount])).toArray();

//        Arrays.stream(allZeorAtEnd).forEach(System.out::println);

    }

    private static void findLargestAndSmallest() {
        System.out.println("findLargestAndSmallest");
        int [] arr = {3,6,8,2,11,9};
        int minValue = Arrays.stream(arr).min().orElseThrow(IllegalArgumentException::new);
        int maxValue = Arrays.stream(arr).max().orElseThrow(IllegalArgumentException::new);

        System.out.println("Largest Value : " + maxValue);
    }

    private static void findDuplicateFromArray() {

        System.out.println("findDuplicateFromArray");
        int [] arr = {2,5,7,8,3,1,2,4,5,3};
        Map<Integer, Long> map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map.entrySet().stream().filter(e -> e.getValue() > 1).forEach((val) -> System.out.println(val.getKey()));
    }
}
