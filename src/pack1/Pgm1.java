package pack1;

import java.io.IOException;
import java.util.Arrays;

class Java {
	public Java(){
		
	}
	int z = 'a' + 'b';
	void meth() throws Exception {
		
	}
}


public class Pgm1 extends Java {
	
	int k = 2;
	
	void meth () throws IOException {
		
	}

	public static void main(String[] args) {
		Java ja = new Java();
		int k = 0;
		int arr[] = {2, 4};
		Object ob = arr;
		int brr[] = {2, 4};
		int a[] = new int[4];
		arr = new int[5];
		int brrc[] = brr;
		//a[0] = null;
		System.out.println(k);
		System.out.println(Arrays.toString(arr));
		System.out.println('a' + 'b');
		System.out.println(ja.z);
		System.out.println(Arrays.toString(brrc));
		
		//System.out.println(11<22<33);
		

	}

}
