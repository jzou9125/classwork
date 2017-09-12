package intro;

public class CodingConventions {

	//Fields are at the top
	private String name; //Note: Declare fields only, Instantiate in the constructor
	private String description;
	
	/*
	 * This is a constructor. It is like a method except the "return type" is an instance of the class
	 * for this reason, a constructor must always be named after the class.
	*/
	public CodingConventions(String name, int descriptionIndex) {
		//instantiate variables now:
		
		//there are two variables called "name" the local variable and the field 
		//distinguish between the two using the reserved word "this"
		this.name = name;
		//this is a static call to a constant
		description = IntroMain.DESCRIPTIONS[descriptionIndex];
	}
	
	//normal method "void".
	public void doStuff(){
		
		//This is a static method call:
		String output = name + description; //use spaces in between operations 
		System.out.println(output);
	}
	
}
