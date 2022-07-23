package pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Maplist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al;
		HashMap<String, ArrayList<String>> mp = new HashMap<>();
		String str[] = {"cat", "dog", "act", "god", "tac"};
		char ch[];
		/*String s = "cat";
		int a[] = {2, 4, 5};
		char ch[] = s.toCharArray();
		Arrays.sort(ch);
		String c = String.valueOf(ch);
		System.out.println(c);*/
		
		for (int i = 0; i < str.length; i++) {
			ch = str[i].toCharArray();
			Arrays.sort(ch);
			al = mp.get(String.valueOf(ch));
			if (al == null) {
				al = new ArrayList<>();
				mp.put(String.valueOf(ch), al);
			}
			al.add(str[i]);
		}
		//System.out.println(mp.get("act"));
		for (Map.Entry<String, ArrayList<String>>  me : mp.entrySet()) 
			System.out.println(me.getValue());
	}

}
