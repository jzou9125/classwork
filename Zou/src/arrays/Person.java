package arrays;

import javax.print.attribute.standard.PrinterLocation;

public class Person {
	public static final String[] FIRST_START = {"Chr", "Am", "L", "D", "Th", "Br", "B", "ni"};
	public static final String[] FIRST_MIDDLE = {"ala", "ima", "e", "o", "anna", "r", "ola","a","gg"};
	public static final String[] FIRST_END = {"na", "ck", "n", "rian", "lius", "lion", "les","tt", "er"};
	
	public static final String[] LAST_START = {"Bl", "Gr", "Ph", "M", "Thr", "As", "Be","Dome"};
	public static final String[] LAST_MIDDLE = {"an", "in", "ast", "own", "il", "mus"};
	public static final String[] LAST_END = {"strom", "son", "rack", "les", "vin", "ston", "s"};
	
	private String firstName ="";
	private String lastName = "";
	private Borough home;
	private Hobby hobby;
	private Object[] friends;
	
	public Person(String first, String last, Borough home) {
		this.firstName = first;
		this.lastName = last;
		this.home = home;
		friends = new Person[3];
		hobby = Hobby.randomHobby();
	}
	public void stateFriend()
	{
		String pString = "My friends are ";
		for(int i = 0; i< friends.length -1; i++)
		{
			pString = pString + friends[i].firstName +" "+ friends[i].lastName;
			pString += ",";
		}
		pString += friends[friends.length-1];
		System.out.println(pString);
	}
	public void mingle(Object[] peers)
	{
		for(Object p: peers)
		{
			if(p != this)
			{
				setInFirstPlace(p);
			}
		}
	}
	public String toString()
	{
		return "My name is " +firstName+" " + lastName +" and I'm from "+ home+".";
	}
	
	public void setInFirstPlace(Object f)
	{
		for(int i = friends.length -1; i>0; i--)
		{
			friends[i] = friends[i-1];
		}
		friends[0] = f;
	}
	
}
