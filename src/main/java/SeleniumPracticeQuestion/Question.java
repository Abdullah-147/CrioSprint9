package SeleniumPracticeQuestion;

public class Question {

	public static void main(String[] args) {
		//Write Java code to get rid of multiple spaces from a string.
		
		String str="My    name  is Abdul      Jamadar  ";
		String answer="";
		Boolean isFirstSpace=false;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				if(!isFirstSpace) {
				answer+=str.charAt(i);
				isFirstSpace=true;
				continue;
			}
				else continue;
			}
			else {
				isFirstSpace=false;
				answer+=str.charAt(i);
			}
	}
		System.out.println(answer.trim());
	}

}
