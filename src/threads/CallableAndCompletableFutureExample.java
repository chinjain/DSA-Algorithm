package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndCompletableFutureExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Runnable run = () -> new CallableAndCompletableFutureExample().someProcess();
		Executor executor = Executors.newSingleThreadExecutor();
		executor.execute(run);

		Callable<String> c1 = () -> buildTask("Chinmay");
		Future<String> future = Executors.newSingleThreadExecutor().submit(c1);
		System.out.println(future.get());
		
		CompletableFuture future2 = CompletableFuture.runAsync(run, executor);
		

	}

	public void someProcess() {
		System.out.println("Ussing runnable interface");
	}

	static String buildTask(String string) {
		
		return string + "Call back Value";
	}

}
