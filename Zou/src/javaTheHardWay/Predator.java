package javaTheHardWay;

public class Predator extends ReproductionAnimal{

	public Predator(Habitat matingArea)
	{
		super(matingArea);
		setMaxLitter(3);
	}
	
	public Predator( Habitat matingArea, String description, Trait trait1, Trait trait2)
	{
		super( matingArea, description, trait1, trait2);
		setMaxLitter(3);
	}
	
	public static final String[] PREDATORS = {"wolf", "bear", "lion", "bobcat"};
	
	public String getName()
	{
		return PREDATORS[(int) (Math.random()*PREDATORS.length)];
	}
	
	public static void main(String[] args)
	{
		Wilderness wilderness = new Wilderness( "A Wooded Area", 10);
		Predator p = new Predator(wilderness);
		wilderness.addAnimal(p);
		wilderness.simulate(2);
	}
	
	public ReproductionAnimal getOffspring(ReproductionAnimal mate) {
		return new Predator(habitat, getDescription(), Trait.getDominatTrait(getTrait1(), mate.getTrait1()), Trait.getDominatTrait(getTrait2(), mate.getTrait2()));
													//the problem is within the getDominatTrait method : there is nothing to do.
	}
	
	public boolean canEat()
	{
		int attempts = 0; 
		while( attempts < 3)
		{
			int tIndex = (int ) (Math.random()* habitat.getAnimals().length);
			Animal target = habitat.getAnimals()[tIndex];
			if( target instanceof Prey)
			{
				habitat.removeAnimal(tIndex);
				return true;
			}
			attempts ++;
		}
		return false;
	}
}
