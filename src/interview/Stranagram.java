package interview;

import java.util.Arrays;

public class Stranagram {
	
	public static void main(String arg[]) {
		String s = "hellh";
		String str = "oellh";
		//char ch[] = s.toCharArray();
		//Arrays.sort(ch);
		//for (int i = 0; i < ch.length; i++)
		//	str += Character.toString(ch[i]);
		//System.out.println(str);
		//if (s.charAt(1) < s.charAt(2))
		//	System.out.println("yes");
		int arr1[] = new int[26];
		int flag = 0;
		Arrays.fill(arr1, 0);
		if (s.length() != str.length())
			System.out.println("not anagram");
		for (int i = 0; i < s.length(); i++) {
			arr1[s.charAt(i) - 'a']++;
			arr1[str.charAt(i) - 'a']--;
		}
		for (int i = 0; i < arr1.length; i++)
			if (arr1[i] != 0) {
				System.out.println("not anagram");
				flag = 1;
				break;
			}
		if (flag == 0)
			System.out.println("anagrams");
		
	}

}
