package algorithim;

public class TowerOfHanoi {

	public static void main( String[] args)
	{
		solve(4, "A", "B", "C");
	}
	
	public static void solve(int n, String start, String helper, String end)
	{
		if( n > 1)
		{
			solve( n-1, start, end, helper);
			System.out.println(start+" to "+end);
			solve(n-1, helper, start, end);
		}
		else
		{
			System.out.println(start+" to "+end);
		}
	}
}
