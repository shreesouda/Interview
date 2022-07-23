package interview;

import java.util.Arrays;
import java.util.Collections;

public class sortshit {

	public static void main(String[] args) {
		Integer arr[] = new Integer[] {2, 5, 1, 7, 6, 4};
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));

	}

}
