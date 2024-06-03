// In memory management terminology, garbage means that portion of memory which was once occupied by objects and is currently no longer used by the program.

// Garbage collection (GC) means reclaiming such memory so that, that space can be used for allocation to other objects.

// The automatic garbage collection in Java is performed by a special thread called Garbage Collector, which is a part of JVM.

// That portion of memory in which the Java objects reside is called heap.

public class Main {
	public void fun() {
		System.out.println("inside fun");
	}

	public static void main(String[] args) {
		System.out.println("inside main");
		Main A = new Main();
		A.fun();
		// A object is not referenced again after this statement hence, reclaimed by
		// Garbage Collector Thread
		System.out.println("inside main again");
	}
}

// when the GC decides to remove an object from memory, it calls the finalize()
// method on the object.

// The finalize() method is declared in the Object class. Hence it is available
// in every class.

// A Java class can override and provide its special implementation in the
// finalize() method.