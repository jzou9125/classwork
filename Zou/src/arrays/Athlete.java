package arrays;

public class Athlete extends Person {

	private int money;
	
	public Athlete(String first, String last, Borough home, int money) {
		//first lines calls a super constructor.
		super(first, last, home);
		
		this.money = money;
		// TODO Auto-generated constructor stub
	}

	public String toString()
	{
		return super.toString() + "I also have $"+money+"!";
	}
}
