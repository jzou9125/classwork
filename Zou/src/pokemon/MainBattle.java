package pokemon;

public class MainBattle {

	 public static void main(String[] args) {
		 Pokemon squirtle = new Pokemon("Squirtle",26);
		 Pokemon bulbasaur = new Pokemon("Bulbasaur",26);
		 squirtle.iChooseYou();
		 bulbasaur.iChooseYou();
		 System.out.println("Squirtle is preparing to attack with water blast");
		 squirtle.attack(bulbasaur, new Attack() {
		 
		 public void attack(Pokemon target) {
			 int hp = target.getHp();
			 target.setHp(hp/2);
		}
		 });
		 System.out.println("Bulbasaur is preparing to attack with poison.");
		 bulbasaur.attack(squirtle, new Attack() {
		 
			 public void attack(Pokemon target) {
			 target.setPoisoned(true);
		}
		});
		 squirtle.lapse();
		 bulbasaur.lapse();
		 printScore(squirtle, bulbasaur);
		 squirtle.attack(bulbasaur, new Attack() {
			
			public void attack(Pokemon target) {
				int hp = target.getHp(); 
				target.setHp(hp-100);
			}
		});
		 
		squirtle.levelUp(new Effect() {
			
			@Override
			public void happen() {
				squirtle.setHp(100);
				squirtle.setPoisoned(false);
				squirtle.setHp((int) (squirtle.getHp() *1.3));
				squirtle.setName("WarTurtle");
				squirtle.iChooseYou();
			}
		});
	 }
	private static void printScore(Pokemon squirtle, Pokemon bulbasaur) {
		System.out.println("Squirtle has"+squirtle.getHp());
		System.out.println(bulbasaur.getName() + " has " + bulbasaur.getHp());
	}
	public MainBattle() {
		// TODO Auto-generated constructor stub
	}

}
