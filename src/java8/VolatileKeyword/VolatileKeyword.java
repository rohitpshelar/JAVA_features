package java8.VolatileKeyword;

// Thread
// local cache - default
// Sheared cache - activate using volatile keyword
public class VolatileKeyword {

	public boolean vola = true;

	public boolean isVola() {
		return vola;
	}

	public void setVola(boolean vola) {
		this.vola = vola;
	}

	public static void main(String[] args) throws InterruptedException {
		VolatileKeyword volatileKeyword = new VolatileKeyword();

		new Thread() {
			public void run() {
				int count = 0;
				while (volatileKeyword.vola) {
					count = count +1;
					System.out.println(count + " Running..");
				}
			};
		}.start();
		
		Thread.currentThread().sleep(1);
	
		new Thread() {
			public void run() {
				volatileKeyword.vola = false;
			};
		}.start();

	}

}
