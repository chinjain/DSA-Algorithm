import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * 
 * Here we can see that we are facing the issue which we need to implement so 
 * what we can don one of the default method we can override and 
 * give the implementation of that in the implementing class
 * 
 * 
 */
public class DiamondProblem implements demo1, demo2 {

	public static void main(String[] args) {

		Map<String, Integer> result = Stream.of("A", "B", "C","A")
				.collect(Collectors.toMap(Function.identity(), s -> 1, (a, b) -> a + b));
		
		result.entrySet().forEach((Map.Entry e) ->{
			System.out.println(e.getKey() + " " +  e.getValue());
		});

	}

	@Override
	public void demo() {
		System.out.println("demo");
	}
}

interface demo1 {
	default void demo() {
		System.out.println("demo1.demo");
	}
}

interface demo2 {
	default void demo() {
		System.out.println("demo1.demo");
	}
}
