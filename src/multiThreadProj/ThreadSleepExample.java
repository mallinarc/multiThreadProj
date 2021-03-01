package multiThreadProj;

import java.time.Duration;
import java.time.Instant;

public class ThreadSleepExample {

	public static void main(String[] args) {
		System.out.println("Inside : " + Thread.currentThread().getName());

		String[] messages = { "If I can stop one heart from breaking,", "I shall not live in vain.", "If I can ease one life the aching,", "Or cool one pain,", "Or help one fainting robin", "Unto his nest again,", "I shall not live in vain" };

		Runnable runnable = () -> {
			System.out.println("Inside : " + Thread.currentThread().getName());
			Instant start = Instant.now();
			for (String message : messages) {
				System.out.println(message);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException intEx) {
					throw new IllegalStateException(intEx);
				}
			}
			Instant finish = Instant.now();
			long elapsedTime = Duration.between(start, finish).toMillis();
			System.out.println("Elapsed time :" + elapsedTime);
		};

		Thread thread = new Thread(runnable);
		thread.start();

	}
}
