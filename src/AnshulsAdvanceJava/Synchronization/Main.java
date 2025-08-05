package AnshulsAdvanceJava.Synchronization;

public class Main {

	// both threads will access the same object and will run in a synchronous manner
	// if we do not put synchronized keyword, then both threads will run in parallel

	// and the output will be different, and randomly
	// we could put a lock on a particular method using synchronized keyword, thus can be used by a single thread at a time

	public static void main(String[] args) {
		MathUtils mu = new MathUtils();
		Thread1 t1 = new Thread1(mu);
		Thread t2 = new Thread(new Thread2(mu)); // Thread2 t2 = new Thread2()
		t1.start();
		t2.start();
	}
}
