package interview;
import java.util.Scanner;

import java.util.Iterator;

import java.util.Map;
import java.util.HashMap;

public class Sample {
	
	//asked in soroco tech interview.
	//check for the existence of an element in an array such that it's the sum of rest of the elements.
	//to find occurence of each elements.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		//int flag = 0;
		int sum = 0;
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		sc.close();
		/*for (int j = 0; j < n; j++) {
			sum = 0;
			for (int k = 0; k < n; k++) {
				if (k != j)
					sum += arr[k];
			}
			if (sum == arr[j]) {
				System.out.print(arr[j]);
				flag = 1;
				break;
			}	
		}
		if (flag == 0)
			System.out.print(-1);*/
		for (int i = 0; i < arr.length; i++) {
			mp.put(arr[i], mp.get(arr[i]) == null ? 1 : mp.get(arr[i]) + 1);
			sum += arr[i];
		}
		if (sum % 2 == 0) {
			if (mp.get(sum / 2) != null)
				System.out.println(sum / 2);
			else
				System.out.println(-1);
		}
		else
			System.out.println(-1);
		Iterator<Map.Entry<Integer, Integer>> it = mp.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, Integer> me = it.next();
			System.out.println(me.getKey() + " " + me.getValue());
		}
		
	}

}
