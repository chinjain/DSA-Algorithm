package STREAM.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<Integer>();
        lista.add(2);
        lista.add(1);
        lista.add(3);
        
        List<Integer> listb = new ArrayList<Integer>();
        listb.add(2);
        listb.add(1);
        listb.add(2);
        
        BiConsumer<List<Integer>, List<Integer>> consumer = (l1,l2) ->{
        	if(l1.size() != l2.size()) {
        		System.out.println(false);
        	}else {
        		for(int i = 0; i < l1.size(); i++) {
        			if(l1.get(i) != l2.get(i)) {
        				System.out.println(false);
        				return;
        			}
        		}
        		
        		System.out.println(true);
        	}
        };
        
        consumer.accept(lista, lista);

	}

}
