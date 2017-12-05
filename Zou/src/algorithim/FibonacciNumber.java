package algorithim;

public class FibonacciNumber {

	public static void main( String[] args)
	{
		System.out.println(fibNumber(10));
	}
	
	public static int fibNumber(int n)
	{
		if( n > 1)
		{
			return fibNumber(n-1)+ fibNumber(n-2);
		}
		return 1;
	}
}
