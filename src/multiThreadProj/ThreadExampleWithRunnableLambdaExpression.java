package multiThreadProj;

public class ThreadExampleWithRunnableLambdaExpression {

	public static void main(String[] args) {
		System.out.println("Inside : " + Thread.currentThread().getName());

		System.out.println("Creating runnable...");
		Runnable runnable = () -> {
			System.out.println("Inside : " + Thread.currentThread().getName());
		};

		System.out.println("Creating Thread...");
		Thread thread = new Thread(runnable);

		System.out.println(" Starting Thread....");
		thread.start();
	}

}
