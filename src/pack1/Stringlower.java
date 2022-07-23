package pack1;

public class Stringlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sf = null;
		int count = 0;
		String s = "This Is Shreenidhi";
		String str = "101010101000";
		System.out.println(s.toLowerCase());
		//String sf = str.replaceFirst("010", "");
		while (str.contains("010")) {
			str = str.replaceFirst("010", "");
			count++;
		}
		System.out.println(str);

	}

}
