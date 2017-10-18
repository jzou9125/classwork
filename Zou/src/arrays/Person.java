package arrays;

public class Person {
	public static final String[] FIRST_START = {"Chr", "Am", "L", "D", "Th", "Br", "B", "ni"};
	public static final String[] FIRST_MIDDLE = {"ala", "ima", "e", "o", "anna", "r", "ola","a","gg"};
	public static final String[] FIRST_END = {"na", "ck", "n", "rian", "lius", "lion", "les","tt", "er"};
	
	public static final String[] LAST_START = {"Bl", "Gr", "Ph", "M", "Thr", "As", "Be","Dome"};
	public static final String[] LAST_MIDDLE = {"an", "in", "ast", "own", "il", "mus"};
	public static final String[] LAST_END = {"strom", "son", "rack", "les", "vin", "ston", "s"};
	
	String firstName ="";
	String lastName = "";
	Borough home;
	
	public Person(String first, String last, Borough home) {
		this.firstName = first;
		this.lastName = last;
		this.home = home;
	}

	public String toString()
	{
		return "My name is " +firstName+" " + lastName +" and I'm from "+ home+".";
	}
	
}
