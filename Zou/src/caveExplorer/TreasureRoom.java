package caveExplorer;

public class TreasureRoom extends NPCRoom {

	public boolean entered = false;
	private int treasure;
	public TreasureRoom(String description) {
		super(description);
		treasure = (int) Math.random()*100;
	}
	
	public void enteredRoom()
	{
		if(!entered)
		{
			int base = CaveExplorer.inventory.getCash();
			base += treasure;
			CaveExplorer.inventory.setCash(base);
			entered = true;
		}
	}

}
