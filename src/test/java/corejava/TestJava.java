package corejava;

import java.util.Arrays;
import java.util.List;

public class TestJava {

	public static void main(String args[]) {
		TestJava test = new TestJava();
//		test.pyramid();
//		test.reversePyramid();
//		test.verticalPrint();
//		test.multiDimentionalArray();
//		test.minNumberArray();
//		test.maxNumberArray();
//		test.maxNoInMinRow();
		test.printit();
	}

	public void pyramid() {
		int k = 1;
		for (int i = 0; i <= 4; i++) {
			for (int j = 1; j <= 4 - i; j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}
	}

	public void reversePyramid() {
		int k = 10;
		for (int i = 0; i <= 4; i++) {
			for (int j = 4 - i; j > 0; j--) {
				System.out.print(k);
				System.out.print("\t");
				k--;
			}
			System.out.println("");
		}
	}

	public void verticalPrint() {
		int k = 1;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(k + j);
				System.out.print("\t");
			}
			System.out.println("");
		}
	}

	public void multiDimentionalArray() {
		int a[][] = new int[2][3];// Delcares an aray and allocates memory for the values
		a[0][0] = 2;
		a[0][1] = 6;
		a[0][2] = 1;
		a[1][0] = 9;
		a[1][1] = 12;// initilased values into that array
		a[1][2] = 15;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println("");
		}
	}
	
	public void minNumberArray() {
		int a[][] = {{3,4,5}, {3,0,7}, {4,2,9}};
		int min = a[0][0];
		for(int i = 0; i<3; i++) {
			for(int j = 0;j<3;j++) {
				if(a[i][j] <= min) {
					min = a[i][j];
				}
			}
		}
		System.out.println(min);
	}
	
	public void maxNumberArray() {
		int a[][] = {{3,4,5}, {3,0,7}, {55,2,9}};
		int max = a[0][0];
		for(int i = 0; i<3; i++) {
			for(int j = 0;j<3;j++) {
				if(a[i][j] >= max) {
					max = a[i][j];
				}
			}
		}
		System.out.println(max);
	}
	
	public void maxNoInMinRow() {
		int a[][] = { { 9 , 4, 5 }, { 3, 8, 7 }, { 0, 2, 9 } };
		int min = a[0][0];
		int mincol = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] <= min) {
					min = a[i][j];
	 				mincol = j;
				}
			}
		}
		int k = 0;
		int max = a[0][mincol];
		while (k < 3) {
			if (a[k][mincol] > max) {
				max = a[k][mincol];
			}
			k++;
		}
		System.out.println(max);
	}
	
	
	public void printit() {
		List<String> a = Arrays.asList("one","two","three");
		System.out.println("this is message" + "\n" + a);
	}

	
	
	
	
	
}