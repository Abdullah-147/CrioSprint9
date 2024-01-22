package Inheritance;

public class classC extends classB{
	public int k=100;
	public int method(){
		System.out.println("Inside ClassC");
		return 0;
	}
	public static void main(String[] args) {
		classC c=new classC();
		System.out.println("End");
	}
}
