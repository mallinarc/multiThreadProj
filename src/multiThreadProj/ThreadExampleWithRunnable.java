package multiThreadProj;

public class ThreadExampleWithRunnable implements Runnable {

	public static void main(String[] args) {
		System.out.println("Inside :" + Thread.currentThread().getName());

		System.out.println("Creating runnable.");
		Runnable runnable = new ThreadExampleWithRunnable();

		System.out.println("Creating Thread.");
		Thread thread = new Thread(runnable);

		System.out.println("Starting Thread....");
		thread.start();
	}

	@Override
	public void run() {
		System.out.println("Inside :" + Thread.currentThread().getName());
	}
}
