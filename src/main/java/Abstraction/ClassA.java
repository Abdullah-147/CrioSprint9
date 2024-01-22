package Abstraction;

abstract class ClassA {
	
	public String str;
	
	public ClassA(String name) {
		System.out.println("ClassA constructor");
	}
	public abstract void methodA();

	public void methodA1() {
		System.out.println("Concrete method from methodA");
	}

}
