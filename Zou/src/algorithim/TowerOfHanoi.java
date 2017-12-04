package algorithim;

public class TowerOfHanoi {

	public static void main( String[] args)
	{
		solve(-1, "A", "B", "C");
	}
	
	public static void solve(int n, String start, String helper, String end)
	{
		if( n > 1)
		{
			solve( n-1, start, end, helper); // move n-1 disks away from the start to the helper
			System.out.println(start+" to "+end); // move the last disk to the end
			solve(n-1, helper, start, end); // repeat for the n-1 pile on helper until the end of the program.
		}
		else
		{
			System.out.println(start+" to "+end);
		}
	}
}
