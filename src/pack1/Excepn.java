package pack1;

import java.util.Arrays;

public class Excepn {
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int a[] = {3, 4, 5};
		int b[] = a;
		System.out.println(Arrays.toString(b));
		//try{
			try {
				meth(-2, 0);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				throw new Exception();
				//System.out.println("enter positive");
			}
		//}
		/*catch(Exception e) {
			System.out.println(e.getMessage());
		}*/
		

	}
	
	public static void meth(int a, int b) throws Exception {
		if (a < 0)
			throw new Exception();
		System.out.println(a/b);
	}

}
