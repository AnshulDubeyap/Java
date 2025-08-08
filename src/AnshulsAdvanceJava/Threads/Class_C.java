package AnshulsAdvanceJava.Threads;

public class Class_C  extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Class C");
		}
	}
}
