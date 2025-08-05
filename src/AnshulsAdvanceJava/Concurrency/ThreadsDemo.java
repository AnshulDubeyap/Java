package AnshulsAdvanceJava.Concurrency;

public class ThreadsDemo {
	public static void main(String[] args) {
		int n = 10;
		for(int i = 0; i < n; i++) {
			// thread t1
				Thread1 t1 = new Thread1();
				t1.start(); // the start method will call the run method(invokes the run method)
			// thread t2
				Thread t2 = new Thread(new Thread2());
				t2.start();
		}
	}
}
