package caveExplorer;

public class CaveRoom {

	private String description; 
	private String directions; //which doors
	private String contents; // a symbol to show room you are in
	private String defaultContents; // what is in the room when your aren't in the room
	
	private CaveRoom[] borderingRooms;
	private Door[] doors; // valid 
	
	//constants
	public static final int NORTH = 0;
	public static final int EAST = 1;
	public static final int SOUTH = 2;
	public static final int WEST = 3;
	
	public CaveRoom( String description) {
		this.description = description;
		setDefaultContents(" ");
		contents = defaultContents; 
		borderingRooms = new CaveRoom[4];
		doors = new Door[4];
		setDirections();
	}

	/**
	 * for every Door in doors[] that is not null, 
	 * this method appends a String describing the door and 
	 * where it is ie: There is a (passage to the north);
	 */
	public void setDirections() {
		directions = "";
		boolean 
		for(int i =0; i< this.doors.length; i++)
		{
			if(this.doors[i] != null)
			{
				doorFound = true;
				this.directions += "There is a "+ this.doors[i].getDescription()+" to "+ toDirection(i)+". "+this.doors[i].getDetails() + "/n"; 
			}
		}
	}
	
	/**
	 * converts an int to a direction:
	 * 0 = north
	 * 1 = east
	 * @param dir
	 * @return
	 */
	public static String toDirection(int dir)
	{
		String[] directions = {"the North", "the East", "the South", "the West"};
		//NOTE: When i sat "no long if-else stat. 
		// this is how you should be thinking
		return directions[dir];
	}
	
	public String getDescription() {
		return description;
	}

	public void setDefaultContents(String defaultContents) {
		this.defaultContents = defaultContents;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDirections() {
		return directions;
	}

	public void setDirections(String directions) {
		this.directions = directions;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

}
