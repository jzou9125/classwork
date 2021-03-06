package attendance;

public class Student implements Attendee {
	
	private String fName; 
	private String lName;
	private boolean isHere;
	private String printl;
	
	public Student(String firstName, String lastName)
	{
		this.fName = firstName; 
		this.lName = lastName;
		isHere = false; 
	}
	//returns true if the student has been marked present, false otherwise
	public boolean isPresent()
	{
		return isHere;
	}

	//sets whether the student has been marked present
	public void setPresent(boolean present)
	{
		isHere = present;
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
		if(matches(last) && first.toLowerCase().equals(fName.toLowerCase()) )
		{
			return true;
		}
		return false;
	}

	//can put to lowerCase
	//returns true if 'first' matches this Attendee's firstName. This should NOT be case sensitive.
	public boolean matches(String last)
	{
		if(last.toLowerCase().equals(lName.toLowerCase()))
		{
			return true;
		}
		return false;
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
		if(lName.length() < 20)
		printl = lName; 
		for( int i = 1; i<3; i++)
		{
			
			while(printl.length() < (20 * i) )
			{
				printl += " ";
			}
			if( printl.length() <= 20)
			{
				printl += fName; 
			}
			else 
			{
				if(this.isPresent())
				{
					printl += "Present";
				}
				else 
				{
					printl += "Absent";
				}
			}
		}
		return printl;
	}

}
