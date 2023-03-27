package corejava;

public class oddpyramid {

	public static void main(String args[]) {
		oddpyramid2();
		// odd();
		// display(5);
	}

	public static void oddpyramid() {
		for (int i = 1; i <= 11; i++) {
			for (int j = i; j <= i; j++) {
				if (j % 2 != 0) {
					System.out.print(j);
				}

			}
			System.out.print("\n");

		}
	}

	public static void oddpyramid2() {
		for (int i = 1; i <= 11; i += 2) {
			int count= 2;
			
			for (int j = i; j <= i * count - 1; j += 2) {
				if (j % 2 != 0) {
					System.out.print(j+ " ");
				}
			}
			count =+ 1;
			System.out.print("\n");
		}
	}

	public static void odd() {
		int i, j, k = 1, num;

		for (i = 1; i <= 12; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k = k + 2;
			}

			System.out.print("\n");
		}
	}

	static void display(int n) {

		int i, j, k;
		for (i = 1; i <= n; i++) {

			for (j = 1, k = i; j <= i; j++, k--) {

				if (k % 2 == 0) {
					// displaying the numbers
					System.out.print(j);
				} else {
					// displaying the stars
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}
	}
}