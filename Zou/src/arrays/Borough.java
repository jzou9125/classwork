package arrays;

public class Borough {

	public static final Borough[] NY_BOROUGHS = {new Borough("Manhattan"), new Borough("Brooklyn"), new Borough("Queens"), new Borough("Bronx"), new Borough("Staten Island")};
	
	String name;
	public Borough( String name) {
		this.name = name;
	}
	public String toString()
	{
		return name;
	}
}
