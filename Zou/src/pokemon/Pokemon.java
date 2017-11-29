package pokemon;

public class Pokemon{
	
	private int level;
	private int hp; 
	private String name;
	private boolean poisoned;

	public void attack(Pokemon target) {
		 target.setPoisoned(true);
	} 
	public Pokemon( String name, int level) {
		hp = 100;
		poisoned = false; 
		this.name = name;
		this.level = level;
		// TODO Auto-generated constructor stub
	}
	
	public void iChooseYou()
	{
		System.out.println(this.getName() + ", " + this.getName()+ "!");
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setPoisoned(boolean poisoned) {
		this.poisoned = poisoned;
	}
	
	public void lapse()
	{
		if( this.poisoned)
		{
			this.setHp(getHp()-15); 
		}
	}
	
	public void levelUp(Effect e)
	{
		level++;
		e.happen();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void attack(Pokemon target, Attack attack){
		 if(Math.random() < .9){
		 attack.attack(target);
		 System.out.println("The attack hit");
		 }else{
		 System.out.println("The attack missed");
		 }
	 }

}
