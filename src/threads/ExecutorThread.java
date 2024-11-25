package threads;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorThread {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		// this is the disadvantage if the thread is in the sleep mode then we are not
		// able to do forcefull completion oft this
		// obj
/*
 * 
 * 1. Multiple future obj can not chain together 
 * 
 * 2. We can not combine or join multi future objects given 5 future object example 
 * 
 * 
 */
		
		// Executo is a frame work to define the custome number of thread from thread pool 
		//For this In executor Frame Work we have ExecutorServices 
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		Future<List<Integer>> f1 = service.submit(() -> {
			System.out.println("Thread:" + Thread.currentThread().getName());
			return Arrays.asList(1, 2, 3, 4);
		});
		
		Future<List<Integer>> f2 = service.submit(() -> {
			System.out.println("Thread:" + Thread.currentThread().getName());
			return Arrays.asList(5,6,7,8);
		});
		
		Future<List<Integer>> f3 = service.submit(() -> {
			System.out.println("Thread:" + Thread.currentThread().getName());
			return Arrays.asList(9,10);
		});
		
		Future<List<Integer>> f4 = service.submit(() -> {
			System.out.println("Thread:" + Thread.currentThread().getName());
			return List.of(11);
		});
		
		Future<List<Integer>> f5 = service.submit(() -> {
			System.out.println("Thread:" + Thread.currentThread().getName());
			return Arrays.asList(23,4,5,23,32,12);
		});
		
		
		System.out.println(f1.get() +" " + f2.get());
		service.shutdown();
	}

//	public static void delay(int min) {
//		try {
//			TimeUnit.MINUTES.sleep(min);
//		} catch (InterruptedException e) {
//
//		}
//	}

}
