package pack1;

public class Snippet {
	
	public static boolean meth(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i + 1] - a[i] == 1)
				return true;
			//else
				//System.out.println("false");
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		int a[] = new int[] {1, 3, 5, 6, 8};
		meth(a);
	}
}

