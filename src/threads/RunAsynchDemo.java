//package threads;
//
//import java.io.File;
//import java.util.concurrent.CompletableFuture;
//import java.util.concurrent.ExecutionException;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//public class RunAsynchDemo {
//
//	public static void main(String[] args) throws InterruptedException, ExecutionException {
//
//		File file = new File("/DefaultDevTesting/employee.json");
//		RunAsynchDemo.saveEmp(file);
//
//	}
//
//	public static Void saveEmp(File jsonFile) throws InterruptedException, ExecutionException {
//
//		ObjectMapper mapper = new ObjectMapper();
//		CompletableFuture<Void> runAsync = CompletableFuture.runAsync(() -> {
//			try {
//
//				// List<EmployeeJson> jsons = mapper.readValue(jsonFile, new
//				// TypeReference<List<EmployeeJson>>() {
//				// });
//				//
//				// System.out.println("thread :" + Thread.currentThread().getName());
//				// jsons.stream().forEach(System.out::println);
//			} catch (Exception e) {
//
//				e.printStackTrace();
//
//			}
//		});
//		return runAsync.get();
//	}
//
//}