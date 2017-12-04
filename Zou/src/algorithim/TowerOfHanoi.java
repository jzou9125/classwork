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
			solve( n-1, start, end, helper); // move n-1 disks away from the start
			System.out.println(start+" to "+end); // move the last disk
			solve(n-1, helper, start, end); // move the n-1 disk towards the end.
		}
		else
		{
			System.out.println(start+" to "+end);
		}
	}
}
