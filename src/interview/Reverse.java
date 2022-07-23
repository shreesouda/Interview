package interview;

public class Reverse {
	
	//reverse an array using recursive approach. can also use iterative approach in similar manner.
	
	static void meth (int arr[], int s, int e) {
		if (s >= e)
			return;
		meth(arr, s + 1, e - 1);
		int temp = arr[s];
		arr[s] = arr[e];
		arr[e] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {4, 2, 4, 6, 1};
		int s = 0;
		int e = arr.length - 1;
		meth(arr, s, e);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

	}

}
