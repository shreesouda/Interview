package interview;
import java.util.ArrayList;

public class Triplet {
	
	//to find a triplet which equals a given sum.
	static void meth (int arr[], int sum) {
		int flag = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = (i + 1); j < arr.length; j++) {
				int val = sum - (arr[i] + arr[j]);
				if (al.contains(val)) {
					System.out.println("triplets are : " + arr[i] + " " + arr[j] + " " + val);
					flag = 1;
					break;
				}
				al.add(arr[j]);
			}
			if (flag == 1)
				break;
		}
		if (flag == 0)
			System.out.println("no such triplets");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{1, 2, 3, 4, 5};
		int sum = 9;
		meth(arr, sum);

	}

}
