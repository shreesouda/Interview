package interview;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Strmanipulate {
	
	//asked in soroco tech interview.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int temp = 0;
		StringBuffer sb = new StringBuffer();
		List<Character> al = new ArrayList<Character>();
		String str = sc.next();
		String strf = "";
		
		String s = "hi";
		System.out.println(str.contains("i".toUpperCase()));
		System.out.println(Character.toUpperCase('i'));
		/*for (int i = 0; i < str.length(); i++) {
			if (!al.contains(str.charAt(i))) {
				temp = (int)str.charAt(i);
				if (temp >= 97 && temp <= 122) {
					if (!al.contains((char)(temp - 32)))
						al.add(str.charAt(i));
				}
				else if (temp >= 65 && temp <= 90) {
					if (!al.contains((char)(temp + 32)))
						al.add(str.charAt(i));
				}
			}
		}
		for (int j = 0; j < al.size(); j++)
			sb.append(al.get(j));
		System.out.print(sb.toString());*/
		for (int i = 0; i < str.length(); i++) {
			if (!strf.contains(String.valueOf(str.charAt(i)).toLowerCase()) && !strf.contains(Character.toUpperCase(str.charAt(i)) + ""))
				strf += str.charAt(i);
		}
		System.out.println(strf);
	}

}
