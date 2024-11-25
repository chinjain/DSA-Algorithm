package threads;

import java.util.LinkedList;
import java.util.Queue;

public class CustomThreadPool {

	public static void main(String[] args) {
		
		ThreadPool pool = new ThreadPool(5);
		for(int i = 0; i < 10; i++) {
			final int taskId = i;
			
			try {
				
				pool.submit(() ->{
				
					System.out.println("Executing task" + taskId + " by " + Thread.currentThread().getName());
					try {
                        Thread.sleep(1000); // Simulate task work
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("Completed Task " + taskId + " by " + Thread.currentThread().getName());
					
				});
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}

class ThreadPool {

	private final int poolSize;
	private final WorkerThread[] workerThread;
	private final Queue<Runnable> taskQueue;
	private boolean isShutdown = false;

	public ThreadPool(int poolSize) {
		this.poolSize = poolSize;
		this.workerThread = new WorkerThread[poolSize];
		this.taskQueue = new LinkedList<>();

		for (int i = 0; i < poolSize; i++) {
			workerThread[i] = new WorkerThread();
			workerThread[i].start();
		}
	}

	public synchronized void submit(Runnable task) {

		if (isShutdown) {
			throw new IllegalStateException("ThreadPool is already shut down.");
		}

		taskQueue.add(task);
		notify();

	}

	public synchronized void shutdown() {
		isShutdown = true;
		for (WorkerThread thread : workerThread) {
			thread.interrupt();
		}
	}

	private class WorkerThread extends Thread {

		@Override
		public void run() {

			while (true) {
				Runnable task;

				synchronized (ThreadPool.this) {
					
					while(taskQueue.isEmpty() && !isShutdown) {
						try {
							ThreadPool.this.wait();
						}catch (Exception e) {
							
							
						}
					}
					
					if(isShutdown && taskQueue.isEmpty()) {
						return;
					}
					
					task = taskQueue.poll();
					
					try {
						if(task != null) {
							task.run();
						}
					}catch (Exception e) {
						
					}

				}
			}

		}

	}
}
