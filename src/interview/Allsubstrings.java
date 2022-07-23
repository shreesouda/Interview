package interview;

import java.util.Vector;

public class Allsubstrings {

	public static void main(String[] args) {
		//to find all substrings of a given string.
		String s = "abcbd";
		String s1 = "";
		System.out.println(s1);
	    //O(n3)
		/*for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				for (int k = i; k <= j; k++) {
					System.out.print(s.charAt(k));
				}
				System.out.println();
			}
		}*/
		//O(n2)
		//vector allows null values!
		Vector<Integer> vt = new Vector<Integer>();
		vt.add(null);
		vt.add(null);
		int arr[] = new int[5];
		//arr[0] = (Integer)null;
		//arr[1] = (Integer)null;
		//System.out.print(arr[0] + " " + arr[1]);
		System.out.println(vt);
		for (int i = 0; i < s.length(); i++) {
			for (int j = (i + 1); j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
			}
		}
		
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == 'b')
				System.out.println(s.replaceFirst(Character.toString(s.charAt(i)), ""));
		
	}

}
