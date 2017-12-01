package algorithim;

public class PrimeNumber {

	public static void main(String[] args){
		 int value = 18;
		 //System.out.println(value+"! is equal to "+factorial(value));
		 System.out.println(value+ " has "+countPrimeFactors(value, 2)+" prime factors.");
		 
		 }

		 public static int countPrimeFactors(int value, int testPrime) {
			 
			 if( value >= testPrime && value != 1)
			 {
				 if( value%testPrime == 0)
				 {
					 return countPrimeFactors((value/testPrime), testPrime) + 1; 
				 }
				 else
				 {
					 return countPrimeFactors((value/testPrime),testPrime + 1) +1; 
				 }
			 }
			 return 0;
		 }

		 public static int factorial(int value) {
		 	return 0;
		 }
}
