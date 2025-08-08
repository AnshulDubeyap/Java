package AnshulsAdvanceJava.Threads.ThreadMethods;

public class Counter {
	int count;

	public synchronized void increment(){
		count ++;
	}
}
