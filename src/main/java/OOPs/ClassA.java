package OOPs;

public class ClassA {
	private int age;
	private String name;
	private double percent;
	protected static String address;

	public int getAge() {
		System.out.println(age);
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		System.out.println(name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercent() {
		System.out.println(percent);
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}
	
	public static void main(String args[]) {
		SingleTon st1=SingleTon.getSingleTonInstance();
		SingleTon st2=SingleTon.getSingleTonInstance();
		System.out.println(st1==st2);
		
	}

}
