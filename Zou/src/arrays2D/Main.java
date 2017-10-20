package arrays2D;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] arr =  {4,3,2,1,0};
		changeNeighbors(arr, 2);
		System.out.println(Arrays.toString(arr));
	}
	
	/**
	 * Precondition: i>=0 and i < arr.length
	 * Increase the element at i by 1
	 * decrease the element at i-1 and i +1 if they exist
	 * avoids Array index out of bounds
	 * @param arr
	 * @param i
	 */
	private static void changeNeighbors(int[] arr, int i) {
		arr[i] = arr[i] +1;
		if(i >= 0)
		{
			arr[i+1] --;
		}
		if(i  <= arr.length -1)
		{
			arr[i-1] --;
		}
	}

}
