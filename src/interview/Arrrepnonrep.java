package interview;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Arrrepnonrep {
	
	//first repeating element.
	static int repeat (int arr[]) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (al.contains(arr[i]))
				return arr[i];
			al.add(arr[i]);
		}
		return -1;
		
	}
	
	//first non-repeating element.
	static int nonrepeat (int arr[]) {
		LinkedHashMap<Integer, Integer> mp = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (mp.containsKey(arr[i]))
				mp.put(arr[i], mp.get(arr[i]) + 1);
			else
				mp.put(arr[i], 1);
		}
		for (Map.Entry<Integer, Integer> me : mp.entrySet()) {
			if (me.getValue() == 1)
				return me.getKey();
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {8, 2, 4, 5, 6, 4, 2, 6, 5, 7};
		System.out.println(repeat(arr));
		System.out.println(nonrepeat(arr));
	}

}
