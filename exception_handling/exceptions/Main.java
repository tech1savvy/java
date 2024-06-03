// if the program does not run as expected due to some abnormal event or situation, the error produced is called an exception ~=~ special runtime error

public class Main {
	public static void main(String[] args) {
		try {
		} catch (Exception  A) { // executed only when exception-1 raised
			A.printStackTrace(); // present in superclass Throwable, hence present in all
		} catch (Exception  B | Exception C) {
		} finally { // always executed
			// optinal to add but only one
			// should be written only after the last catch block
			// useful for writing the cleanup code
		}
		// its possible to have only try and finaly blocks!!
	}
}

/*
//
> Exception Heirarchy
- Throwable is the super class for all Error and Exception Classes
* check image attached

> Checked Exceptions : (out of porgram control) compiler checks whether the exceptions are handled, generally represent external conditions that are outside the control of the program, such as I/O errors, network errors, or database connectivity issues.
	- IO Exceptions
		- FileNotFoundException
	- ClassNotFoundException
	- SQLException
	- InterruptedException

> Unchecked Exceptions : (within program contorl) compiler does not enforce handling or declaring unchecked exceptions, as they are assumed to be caused by programming errors that should be detected and fixed during development.
such as invalid method arguments, null references, or array index violations.
	- Error
	- RuntimeException
some examples:
	- NullPointerException
	- ArrayIndexOutOfBoundsException
	- ArithmeticException
	- IllegalArgumentException
	- ClassCastException
*/