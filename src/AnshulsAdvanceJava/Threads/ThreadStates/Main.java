package AnshulsAdvanceJava.Threads.ThreadStates;

public class Main {

	// different states of a thread
	// 1. RUNNABLE --> a thread that is ready to run (waiting for scheduler in operating system)
	// 2. RUNNING --> a thread that is currently executing (passed through runnable state)
	// 3. WAITING --> a thread that is waiting for another thread, can be achieved by the wait()/sleep() methods
	// 4. NEW --> a thread that is just created
	// 5. DEAD --> a thread that is no longer running


	// RUNNABLE  --> run() --> RUNNING
	// RUNNING --> join() --> WAITING
	// WAITING --> notify() --> RUNNABLE
	// WAITING --> notifyAll() --> RUNNABLE
	// NEW --> start() --> RUNNABLE
	// RUNNING --> stop() --> DEAD
	public static void main(String[] args) {

	}
}
