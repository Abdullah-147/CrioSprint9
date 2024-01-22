package SeleniumPracticeQuestion;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=985432;
		int invert=0;
//		StringBuffer sb=new StringBuffer(String.valueOf(number));
//		int answer=Integer.parseInt(String.valueOf(sb.reverse()));
//		System.out.println(sb);
		while(number!=0) {
			invert=invert*10+number%10;
			number/=10;
		}
		System.out.println(invert);
	}

}
