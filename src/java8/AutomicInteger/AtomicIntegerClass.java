package java8.AutomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerClass {
	
	public static void main(String[] args) throws InterruptedException {
		AtomicInteger atomicInteger = new AtomicInteger();
		System.out.println("inin= "+atomicInteger.get());
		new Thread() {
			public void run() {
				atomicInteger.incrementAndGet();
				System.out.println("1= "+atomicInteger.get());
			};
		}.start();
		
		atomicInteger.incrementAndGet();
		System.out.println("2= "+atomicInteger.get());

		Thread.sleep(1);
	
		new Thread() {
			public void run() {
				atomicInteger.incrementAndGet();
				System.out.println("3= "+atomicInteger.get());
			};
		}.start();

		Thread.currentThread().wait();
		System.out.println("Final :"+atomicInteger.get());
	}

}
