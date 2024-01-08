package STREAM.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceExample {

	public static void main(String[] args) {

		Consumer<List<Integer>> consumer = (list) -> {
			for (int i = 0; i < list.size(); i++) {
				list.set(i, 2 * list.get(i));
			}
		};

		Consumer<List<Integer>> consumer2 = list -> list.stream().forEach(a -> System.out.println(a));
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(3);

		consumer.andThen(consumer2).accept(list);

	}

}
