package exceptions;

public class ExceptionHandlingExamples {
	public static void main(String[] args) {

	}

	void callingMethod1() {
		A a = new A();
		try {
			a.method1();
		} catch (CheckedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	void callingMethod2() throws CheckedException 
	{
	    A a = new A();
	    a.method1();
	}
	
	
	void callingMethod3() 
	{
	    A a = new A();
	    a.method2();
	}


}

class CheckedException extends Exception {
}

class UncheckedException extends RuntimeException {
}

class A {
	void method1() throws CheckedException {
	}

	void method2() throws UncheckedException {
	}
}
