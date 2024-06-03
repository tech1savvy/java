// Multithreading is the execution of multiple threads within a single task, whereas multitasking is the execution of multiple tasks simultaneously.
	// arre khana kya chahte ho??

class MyThread extends Thread{
	public void run(){ // contains the code to be executed by the thread
		System.out.println("inside mythread");
	}
	/*
	Key features of the Thread class include:

	Thread Lifecycle: Threads go through various states such as new, runnable, blocked, waiting, and terminated. The Thread class provides methods to control the lifecycle of a thread, such as start(), sleep(), join(), yield(), and interrupt().
	Priority: Threads can have priority levels ranging from 1 to 10. Higher-priority threads are given preference for execution by the scheduler.
	Synchronization: The Thread class provides synchronized methods and blocks for coordinating access to shared resources among multiple threads.
	*/
}

class MyRunnable implements Runnable{
	public void run(){
		System.out.println("inisde myrunnable");
	}

	/*
	Key features of the Runnable interface include:

	Encapsulation: Runnable separates the task logic from the thread management logic, promoting better separation of concerns.
	Flexibility: Multiple threads can execute the same Runnable instance concurrently, providing better resource utilization.
	Compatibility: Runnable is compatible with other Java APIs, such as Executors in the java.util.concurrent package, which provides advanced features for managing thread execution.
	*/
}

public class Main {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();

		Thread runnable = new Thread(new MyRunnable());
		runnable.start();
	}
}

/* Thread States
NEW - start() method is not yet called on it.
RUNNABLE - when the start method is called and the thread is executing the code in run() method.
BLOCKED 
WAITING
TIMED_WAITING - wait for a specified waiting time
TERMINATED - when a thread finishes its execution.

Note that when a new Thread is created it does not start automatically. 
At that moment it is in the NEW state. And after a thread's state changes to TERMINATED, it cannot be started again.

Note: stop() method  Thread class is deprecated
*/