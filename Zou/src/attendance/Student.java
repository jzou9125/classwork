package attendance;

public class Student implements Attendee {
	
	
	public Student(String firstName, String lastName)
	{
		String fName = firstName; 
		String lName = lastName;
	}
	//returns true if the student has been marked present, false otherwise
	public boolean isPresent()
	{
		
	}

	//sets whether the student has been marked present
	public void setPresent(boolean present)
	{
		
	}

	//returns the firstName
	public String getFirstName()
	{
		return this.fName;
	}

	//returns the lastNameName
	public String getLastName()
	{
		return this.lName;
	}

	//returns true if 'first' and 'last' match this Attendee's firstName and lastName. This should NOT be case sensitive. 
	public boolean mathces(String first, String last)
	{
		
	}

	
	//returns true if 'first' matches this Attendee's firstName. This should NOT be case sensitive.
	public boolean matches(String last)
	{
		
	}

	//returns three words separated by 20 spaces: 
	//at index 0, the last name
	//at index 20, the first name
	//at index 40, the word PRESENT or ABSENT
	//ADDED CHALLENGE:
	//if last name or first name is longer than 20 characters, 
	//cut off the last three letters and replace with "..."
	public String getReportString()
	{
		
	}

}
