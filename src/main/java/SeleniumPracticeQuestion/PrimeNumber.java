package SeleniumPracticeQuestion;

public class PrimeNumber {
	
	public static Boolean isPrime(int number) {
		if(number==1) return true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 297151;
		int nearestPrime=0;
		
		if(!isPrime(number)) {
			for(int i=number-1;i>=2;i--) {
				if(isPrime(i)) {
					nearestPrime=i;
					break;
				}
			}
			System.out.println(nearestPrime);
		}
		else System.out.println("Given number itself is a Prime number!");
		
	}

}
