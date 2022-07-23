package pack1;
import java.util.*;

public class Sample {
	
	public static boolean isFilled(int arr[][], int x, int y) {
		if (arr[x][y] == 0)
			return false;
		return true;
	}
	
	public static void fill(int arr[][], int x, int y) {
		arr[x][y] = 1;
	}
	
	public static void paintAll(int arr[][], int x, int y) {
		if (x > 4 || y > 4 || x < 0 || y < 0)
			return;
		if (!isFilled(arr, x, y)) {
			fill(arr, x, y);
			//return;
		}
		paintAll(arr, x + 1, y + 1);
		//paintAll(arr, x - 1, y - 1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[5][5];
		int x = sc.nextInt();
		int y = sc.nextInt();
		paintAll(arr, x, y);
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}

}
