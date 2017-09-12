package intro; //package declaration: matches folder where this file is located

//class header 
public class IntroMain {
	
	
	public static final String[] DESCRIPTIONS = {" is a teacher at BTHS", " is a student at BTHS"}; 

	//This is the first method that is executed. it is static because it is independent of Instances
	public static void main(String[] args) {
		
		/*
		 * this is the declaration of an instance of CodingConventions 
		 * In the same line of code, It is also being Instantiated
		 * note the use of the word "new" this word is always used when calling constructors
		 */
		
		
		int numberOfPeople = 10; 
		for (int i =0; i < numberOfPeople; i++) {
			CodingConventions conventionsInstance = new CodingConventions("Jason", i%2);
			
			/*
			 * a not on local variables: they are not fields (HAS-A relationships)
			 * they are variables that are only used in the scope of a method
			 * after the method, they are destroyed
			 */
			
			/*
			 * instance method call (the method belongs to the instance, not the class)
			 */
			conventionsInstance.doStuff();
		}
	}
}
