package arrays;

public class ObjectMain {

	public ObjectMain() {
		Object[] people = new Object[34];
		populate(people);
		for(Object p: people)
		{
			((Person) p).mingle(people);
			System.out.println(p);
			p.stateFriend;
		}
		
	}

	private void analyzeCommonalities(Object[] people, int e)
	{
		double averageCommonalities = 0;
		double trials = 600;
		for(int i=0; i< trials; i++)
		{
			Object[] group = selectGroup(people, e);
			averageCommonalities += countCommonalities(people, group);
		}
		
		averageCommonalities = (averageCommonalities/trials);
		System.out.println(averageCommonalities);
	}
	private int countCommonalities(Object[] arr1, Object[] group)
	{
		int itemsSimilar = 0;
		for(int i =0; i<arr1.length; i++)
		{
			if(arr1[i].equals(group[i]))
			{
				itemsSimilar ++;
			}
		}
		return itemsSimilar;
	}
	public Object[] selectGroup(Object[] population, int length)
	{
		Object[] rArr = new Object[length];
		if(checkIfAllUnique(population))
		{
			rArr = chooseRandomPersons(population, length);
		}
		
	return rArr;
	}

	private boolean checkIfAllUnique(Object[] population) {
		for(int i = 0; i<population.length -1; i++)
		{
			for(int e = i+1; e< population.length; e++)
			{
				if(population[i].equals(population[e]))
				{
					return false;
				}
			}
		}
		return true;
	}
	private Object[] chooseRandomPersons(Object[] population, int length) {
		
		int[] idxes = new int[length];
		Object[] rArr = new Object [length];
		for(int i =0; i<idxes.length; i++)
		{
			int index = (int) (Math.random() * length);
			if(isNotARepeat(idxes, index, i))
			{
				idxes[i] = index;
			}
			else 
			{
				i--;
			}
		}
		
		for(int i =0; i< idxes.length; i++)
		{
			rArr[i] = population[idxes[i]];
		}
		
		return rArr;
	}
	private boolean isNotARepeat(int[] idxes, int index, int n) {
		for(int i = 0; i<n; i++)
		{
			if(idxes[i] == index)
			{
				return false;
			}
		}
		return true;
	}
	private void populate(Object[] people) {
		for(int i = 0; i<people.length; i++)
		{
			String firstName = randomNameFrom(Person.FIRST_START,Person.FIRST_MIDDLE, Person.FIRST_END);
			String lastName = randomNameFrom(Person.LAST_START, Person.LAST_MIDDLE, Person.LAST_END);
			Borough home = randomBorough();
			
			if(Math.random() <.6)
			{
				int money = (int)((Math.random()*20)+1)*1000000;
				people[i] = new Athlete(firstName, lastName,home, money);
			}
			else 
			{
				people[i] = new Person(firstName, lastName, home);
			}
			
		}
	}

	private Borough randomBorough() {
		return Borough.NY_BOROUGHS[(int) (Math.random() * Borough.NY_BOROUGHS.length)];
	}

	private String randomNameFrom(String[] a, String[] b, String[] c) {
		return get(a) + get(b)+ get(c);
	}

	private String get(String[] a) {
		
		return a[(int) (Math.random() * a.length)];
	}

	public static void main(String[] args) {
		ObjectMain obj = new ObjectMain();
	}

}
