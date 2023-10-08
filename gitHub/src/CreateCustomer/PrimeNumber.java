package CreateCustomer;

public class PrimeNumber {
	public static void main(String[] args) {
		int num=7;
		int i=2;
		int count=0;
		while(i<num/2) {
			if(num%i==0) {
				count++;
				break;
			}
			i++;
		}
		if(count==1) 
			System.out.println("The given number is prime number");
			else
				System.out.println("The given number is not prime number");
		
	}

}
