package arrays;

import java.util.Arrays;

public class ArraysMain {

	private String[] suits;
	private String[] values;
	
	public ArraysMain() {
		suits = new String[4];
		suits[0] = "Diamond";
		suits[1] = "Clover";
		suits[2] = "Hearts";
		suits[3] = "Spades";
		values = new String[13];
		for(int i = 0; i< values.length; i++)
		{
			values[i] = ""+(i+1);
		}
		values[0] = "Ace";
		values[12] = "King";
		values[11] = "Queen";
		values[10] = "Jack";
		printDeck();
		
	}
	private void printDeck() {
		String[] deck = new String[52];
		int idx = 0;
		for(int i = 0; i<values.length; i++)
		{
			for(int e = 0; i<suits.length; i++)
			{
				deck[idx] = suits[e] + values[i];
				idx ++;
			}
		}
		System.out.println(Arrays.toString(deck));
	}
	private void shuffle(int[] arr) {
		int[] newArr = new int[50];
		for(int i = 0; i < arr.length; i++)
		{
			newArr[i] = 
		}
		
	}
	private void swap(int[] arr, int i, int j) {
		int holder = arr[i];
		arr[i] = arr[j];
		arr[j] = holder;
	}
	/**
	 * populate arr with numbers from 1 to arr.length
	 * @param testArray2
	 */
	private void populate1ToN(int[] arr) {
		for(int i = 1; i<= arr.length;i++)
		{
			arr[i-1] = i;
		}
	}

	private void countOccurence(int[] arr, int start, int end) {
		int[] counter = new int[end -start + 1];
		for(int value: arr)
		{
			counter[value - start]++;
		}
		for(int i = 0; i< counter.length; i++)
		{
			System.out.println("The value "+ (i+start) +" was rolled "+ counter[i] +" times" );
		}
	}
	/**
	 * This method populates arr with results from rolling 2 dice
	 * @param arr
	 */
	private void populate(int[] arr) {
		for(int i = 0; i< arr.length; i++)
		{
			arr[i] = diceRoll(3);
		}
	}
	public void arrayNotes()
	{
		//Two Ways to construct and array
		
		int[] firstWay = {0,1,2,3,4,5};
		//this way will only work with the declaration.
		// ie: firstWay = {6,7,8,9,10}; will not work
		
		String[] secondWay = new String[5];
		//secondWay[0] = 1; 
		// add in values manually + individually
		
		// Two ways to iterate through an array:
		for(int i = 0; i< secondWay.length; i++)
		{
			System.out.println("The #"+i+" element is "+secondWay[i]);
		}
		// "for each int in the array"
		for(String value: secondWay)
		{
			System.out.println("Element is "+ value);
		}
		//Note: primitive arrays are auto-populated with 0s
		// Object arrays are not populated(null)
	}
	public static void main(String[] args) {
		ArraysMain sample = new ArraysMain();
		/*
		 * 1: Arrays are collections of primitives and Objects
		 * Special Notes: this is the only collection of primitives
		 * 
		 * 2: Size cannot be edited/changed
		 * 
		 * 3: Elements of an array are references to objects. In other words,
		 *	changing an element of an array changes the reference not the object.
		 *
		 */
		
		
	}
	
	/**
	 * returns the result(sum) after rolling n number of dice
	 * @param n
	 * @return
	 */
	public int diceRoll(int n)
	{
		int sum = 0;
		for(int i = 0; i < n; i++)
		{
			int result = (int)(Math.random() * 6) + 1;
			sum += result;
		}
		return sum;
	}
}
