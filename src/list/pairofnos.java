package list;
import java.util.ArrayList;
public class pairofnos {
	
	
	//to find pair of no.s from given array whose sum equals given sum.
	public static void meth (int arr[], int sum) {
		ArrayList<Integer> ls = new ArrayList<>();
		//int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			int temp = sum - arr[i];
			if (ls.contains(temp)) {
				System.out.println(arr[i] + " " + temp);
				break;
			}
			else
				ls.add(arr[i]);
		}
	}

	public static void main(String[] args) {
		int arr[] = new int[] {1, 4, 5, 6, 10, 13, 15, 19};
		int sum = 14;
		meth(arr, sum);

	}

}
