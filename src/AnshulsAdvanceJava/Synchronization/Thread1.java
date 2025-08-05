package AnshulsAdvanceJava.Synchronization;

public class Thread1 extends Thread{
	// Accessing the synchronized method
	MathUtils mu;

	public Thread1(MathUtils mu) {
		this.mu = mu;
	}

	@Override
	public void run() {
		try{
			mu.getMultiples(5);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
