package AnshulsAdvanceJava.Concurrency;


// second approach to create a thread, because java does not support multiple inheritance, thus we have to use interfaces
public class Thread2 implements Runnable {
	@Override
	// Overriding the run method
	public void run() {
		System.out.println("Thread 2 is running");
	}
}
