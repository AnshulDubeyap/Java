package AnshulsAdvanceJava.Threads.ThreadMethods;

public class Main {

	// Join()--> Our main thread will wait for the child thread to complete
	// synchronized()--> Only one thread can access a synchronized block, at a time
	// sleep()--> Our main thread will sleep for the specified time

	public static void main(String[] args) throws InterruptedException {
		// creating object for counter
		Counter C = new Counter();

		// Making two threads

		Runnable obj1 = ()-> {
			for (int i = 0; i<10000; i++){
				C.increment();
			}
		};

		Runnable obj2 = () -> {
			for(int i = 0; i<10000; i++){
				C.increment();
			}
		};

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();

		System.out.println(C.count); // output = random number

		t1.join(); // main thread will wait for t1 to complete
		t2.join(); // main thread will wait for t2 to complete

		System.out.println(C.count); // output = 2000


	}


}
