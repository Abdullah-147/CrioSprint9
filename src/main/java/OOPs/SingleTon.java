package OOPs;

public class SingleTon {
	private SingleTon() {};
	private static SingleTon st;
	
	public static SingleTon getSingleTonInstance() {
		if(st==null) {
			st=new SingleTon();
		}
		return st;
	}
	
}
