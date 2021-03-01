package Sundries;

import java.time.Duration;
import java.time.Instant;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class CamelFileRouteMain {

	public static void main(String[] args) {
		System.out.println("Came inside main");
		CamelContext cmlCtx = new DefaultCamelContext();
		FileRouteBuilder frb = new FileRouteBuilder();
		Instant start = Instant.now();
		try {
			cmlCtx.addRoutes(frb);
			cmlCtx.start();
			Thread.sleep(5 * 60 * 1000);
			cmlCtx.stop();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		Instant end = Instant.now();
		System.out.println("Took:" + Duration.between(start, end));

	}
}
