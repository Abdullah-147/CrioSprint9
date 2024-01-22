package Abstraction;

public class ClassB extends ClassA{
	String str;
	public ClassB(String name,String str) {
		super(name);
		// TODO Auto-generated constructor stub
	}
//	@Override
//	public void methodA() {
//		// TODO Auto-generated method stub
//		//this.methodA();
//		super.methodA1();
//		super.str="";
//		this.str="";
//		System.out.println("MethodA from ClassB");
//	}
	
	public static void main(String[] args) {
		ClassB b=new ClassB("","");
		b.methodA();
		//str="";
	}

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		
	}


}
