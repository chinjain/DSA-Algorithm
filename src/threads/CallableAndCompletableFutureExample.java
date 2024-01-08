package threads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CallableAndCompletableFutureExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		// Runnable run = () -> new CallableAndCompletableFutureExample().someProcess();
		Executor executor = Executors.newFixedThreadPool(5);
		// executor.execute(run);
		//
		// Callable<String> c1 = () -> buildTask("Chinmay");
		// Future<String> future = Executors.newSingleThreadExecutor().submit(c1);
		// System.out.println(future.get());
		//
		// CompletableFuture future2 = CompletableFuture.runAsync(run, executor);

		/*
		 * 1. RunAsynch() -> return type is Void it will take runnable obj argument
		 * 
		 * 2. supplyAsync() -> return the value as per your requirment it will take
		 * callable obj argument !!
		 * 
		 * 
		 */
		multipleCompletableFutureCalls();
		testOfCompletablefuture();
		CompletableFuture result = CompletableFuture.supplyAsync(() -> {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				throw new IllegalStateException(e);
			}
			return "Knolders!";
		}, executor).thenApply(name -> "Hello " + name).thenApply(greeting -> greeting + " Welcome to Knoldus Inc!");
		;

		System.out.println(result.get());
	}

	// public void someProcess() {
	// System.out.println("Ussing runnable interface");
	// }
	//
	// static String buildTask(String string) {
	//
	// return string + "Call back Value";
	// }

	private static void testOfCompletablefuture() throws InterruptedException, ExecutionException {
		CompletableFuture<String> future = CompletableFuture.completedFuture("Hello Chinmay").thenApply(s -> {
			return s.toUpperCase();
		});
		System.out.println(future.get());

	}

	public static void multipleCompletableFutureCalls() throws InterruptedException, ExecutionException {

		final CompletableFuture<Integer> serv1 = CompletableFuture.supplyAsync(() -> slowService(1));
		final CompletableFuture<Integer> serv2 = CompletableFuture.supplyAsync(() -> slowService(2));
		final CompletableFuture<Integer> serv3 = CompletableFuture.supplyAsync(() -> slowService(3));

		// CompletableFuture.allOf(serv1, serv2, serv3).get();
		CompletableFuture.completedFuture(serv1);

		final int value1 = serv1.get();
		final int value2 = serv2.get();
		final int value3 = serv3.get();

		System.out.println(value1 + value2 + value3);
		System.out.println(value1 + " " + value2 + " " + value3);
	}

	private static Integer slowService(int i) {
		try {

			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return i;
	}

}
