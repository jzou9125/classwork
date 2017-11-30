package algorithim;

public class LionsPuzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfLions = 2;
		if( willEat(numberOfLions))
		{
			System.out.println("Eat the Sheep!");
		}
		else
		{
			System.out.println("Do not eat the sheep!");
		}
	}

	private static boolean willEat(int numberOfLions) {
		if( numberOfLions == 1)
		{
			return true;
		}
		else
		{
			return !willEat( numberOfLions -1);
		}
	}

}
