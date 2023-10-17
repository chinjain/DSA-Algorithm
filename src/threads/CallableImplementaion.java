package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableImplementaion {

	public static void main(String[] args) {
		// Create an ExecutorService with a fixed number of threads
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		// Define a Callable task
		Callable<String> callableTask = new Report("Tesing report is sending to you");

		// Submit the Callable task to the ExecutorService
		Future<String> future = executorService.submit(callableTask);

		try {
			// Get the result of the Callable task (this blocks until the task is done)
			String result = future.get();
			System.out.println("Task result: " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Shut down the ExecutorService when done
		executorService.shutdown();
	}

}

class Report implements Callable<String> {
	private String reportName;

	public Report(String reportName) {
		this.reportName = reportName;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(5000); // Sleep for 5 seconds
		return "Report '" + reportName + "' processing completed";
	}
}
