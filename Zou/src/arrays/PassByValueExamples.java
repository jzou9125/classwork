package arrays;

import java.util.Arrays;

public class PassByValueExamples {

	public static void main(String[] args) {
		String s = "hello";
		int x= 5;
		Person p = new Person("random", "dude", Borough.NY_BOROUGHS[0]);
		int[] arr = {1,2,3};
		
		test1(p);
		test3(arr);
		System.out.print(p+", "+x+", "+Arrays.toString(arr));
	}
	/**
	 * This is how you can change arrays via the local variable:
	 * through its references (i.e indices)
	 * because primitives don't reference other data (that's why they're called primitive)
	 * is it not possible to change them via a local variable
	 * like we did with objects and arrays.
	 * @param arr
	 */
	private static void test3(int[] arr) {
		arr[0] = 99;
		arr[1] = 98;
	}

	private static void test1(Person p) {
		p.setFirstName("Original");
	}
	private static void changeEverything(String s, int x, int[] arr) {
		s = "goodbye";
		x = -5;
		arr = new int[2];
		arr[0] = -1;
		arr[1] = -2;
		
	}

}
