package interview;

public class evenodd {
	
	//rearrange array such that all even elements are at the begining and odd are at the end. aksed in nextgen.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		evod ed = new evod();
		ed.meth();
		
		int arr[] = {1, 2, 3, 4, 7, 9, 1, 4, 6};
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] % 2 == 0 && arr[i] % 2 != 0) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					break;
				}
			}
		}
		for (int k = 0; k < arr.length; k++)
			System.out.print(arr[k] + " ");
		System.out.println();
		
		main();

	}
	
	static void main() {
		System.out.println("Hello!");
	}

}

class evod extends evenodd {
	public void meth () {
		System.out.println("Hi from child class evod!");
	}
}
