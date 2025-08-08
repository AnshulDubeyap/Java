package AnshulsAdvanceJava.Threads;

public class Main {
	// Thread --> A thread is a flow of execution in a program, its smallest unit of execution
	// Every thread is called by start() method, and run() method is called when the thread is started
	// We use sleep() method to pause the execution of a thread,
	// We also set the priority of a thread using setPriority() method
	// We can also use interfaces to create threads, instead of extending Thread class


	public static void main(String[] args) {

		Class_A a = new Class_A(); // creating an object of class A
		Class_B b = new Class_B(); // creating an object of class B

		a.showA(); // calling showA() method of class A
		b.showB(); // calling showB() method of class B

		// The output will come in a sequential order, first showA() then showB() will be printed

		// How can I make them run in parallel?, --> by using threads
		// just extend the Thread class to class C and class D

		Class_C c = new Class_C(); // creating an object of class C
		Class_D d = new Class_D(); // creating an object of class D

		c.start(); // calling start() method of class C
		d.start(); // calling start() method of class D

		// The output will come in a parallel order, random order of execution of showC() and showD()

		// If both threads are running in parallel, is there a way to give one thread a higher priority?
		// --> by using the setPriority() method

		// Threads priority can be set from 1 to 10
		c.setPriority(1); // setting the priority of thread C to 1 (the lowest priority)
		d.setPriority(10); // setting the priority of thread D to 10 (the highest priority)

		// Another way to set the priority
		c.setPriority(Thread.MAX_PRIORITY); // setting the priority of thread C to 10 (the highest priority)
		d.setPriority(Thread.MIN_PRIORITY); // setting the priority of thread D to 1 (the lowest priority)

		// but then again, these are just suggestions to the operating system scheduler
		// the operating system scheduler will decide the actual priority

		// Can't we just tell a thread to Wait for a while?
		// --> by using the sleep() method

		// Another Way to create a thread?
		// --> by using interfaces

		// Upcasting the ThreadByInterface class to Runnable interface
		Runnable r1 = new ThreadByInterface();

		// Creating a thread using the Runnable interface
		Thread t1 = new Thread(r1);

		// Starting the thread
		t1.start();

		// Thread using lambda expression and Anonymous inner class (Very simple way of creating a thread)
		// Runnable is a functional interface, so we can use lambda expression to create a thread

		// No need to create a class, just use lambda expression

		// Creating a thread using lambda expression
		Runnable obj = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("hello");
			}
		};
		Runnable obj2 = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Hi");
			}
		};

		Thread A = new Thread(obj);
		Thread B = new Thread(obj2);

		A.start();
		B.start();
	}
}
