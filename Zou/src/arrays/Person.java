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
	private Person[] friends;
	private String nickName;
	
	public Person(String first, String last, Borough home) {
		this.firstName = first;
		this.lastName = last;
		this.home = home;
		friends = new Person[3];
		hobby = Hobby.randomHobby();
		nickName = createNickname(firstName);
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Pass by value
	 * the parameters of a method contain only values, no references
	 * therefore, when they are change, the reference to the original
	 * object does not change.
	 * @param name
	 * @return
	 */
	public static String createNickname(String name)
	{
		int length = idxVowel(name);
		if(length == -1)
		{
			return name;
		}
		return name.substring(0, length);
	}
	private static int idxVowel(String name) {
		int count = 0;
		for(int i = 0; i< name.length()-1; i++)
		{
			String letter = name.substring(i, i+1).toLowerCase();
			
				if(letter.equals("a") || letter.equals("e") || letter.equals("i")||letter.equals("o")||letter.equals("u"))
				{
					if(count == 0)
					{
						count++;
					}
					else
					{
						return i;
					}
				}	
		}
		return -1;
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
	public void mingle(Person[] peers)
	{
		for(Person p: peers)
		{
			if(p != this)
			{
				setInFirstPlace(p);
			}
		}
	}
	public String toString()
	{
		return "My name is " +firstName+" " + lastName +". Call me "+ nickName +", and I'm from "+ home+".";
	}
	
	public void setInFirstPlace(Person f)
	{
		for(int i = friends.length -1; i>0; i--)
		{
			friends[i] = friends[i-1];
		}
		friends[0] = f;
	}
	
}
