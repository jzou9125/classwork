package arrays2D;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Array2Dsampler test = new Array2Dsampler();
	}
	
	/**
	 * Precondition: i>=0 and i < arr.length
	 * Increase the element at i by 1
	 * decrease the element at i-1 and i +1 if they exist
	 * avoids Array index out of bounds
	 * Always check for exceptions.
	 * @param arr
	 * @param i
	 */
	private static void changeNeighbors(int[] arr, int i) {
		arr[i] = arr[i] +1;
		if(i >= 1)
		{
			arr[i-1] --;
		}
		if(i  <= arr.length -2)
		{
			arr[i+1] --;
		}
	}

}
