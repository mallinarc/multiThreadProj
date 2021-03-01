package multiThreadProj;

public class ThreadExample extends Thread {
	@Override
	public void run() {
		System.out.println("Inside the :" + Thread.currentThread().getName());
	}

	public static void main(String[] aregs) {
		System.out.println("Inside : " + Thread.currentThread().getName());

		System.out.println("Creating thread....");
		Thread thread = new ThreadExample();

		System.out.println("Starting thread....");
		thread.start();
	}

}
