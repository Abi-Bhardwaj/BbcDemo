package corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingNo {
	ArrayList<Integer> al = new ArrayList<Integer>();

	public static void main(String[] args) {
		// int no[] = { 3, 17, 24, 31, 45, 52 };
		int no[] = { 1,3,9,12};
//		int[] sequence = {1, 3, 5, 7, 11};
//        System.out.println("The missing term is " + missingNumber1(sequence));
        int[] sequence1 = {3,17,24,31,38,45,52};
//        System.out.println("The missing term is " + missingNumber1(sequence1));
        int[] sequence2 = {3,10,17,24,31};
        System.out.println("The missing term is " + missingNumber1(sequence2));
		MissingNo mis = new MissingNo();
		// mis.missingNo2();
		System.out.println("------------------------------");
		// mis.missNo(no);
		System.out.println("------------------------------");
		//mis.missingNo(no);
		// assignment();
		missingNumber2(sequence2);

	}
	 // int[] sequence2 = {3,17,24,31};
	public static int missingNumber1(int[] sequence) {
		int seq = sequence.length;
		int left = 0, right = seq - 1, num = 0;
		int diff = (sequence[seq - 1] - sequence[0]) / seq;
		while (left <= right) {
			int mid = right - (right - left) / 2;
			
			if (mid + 1 < seq && sequence[mid + 1] - sequence[mid] != diff) {
				return sequence[mid + 1] - diff;
			} else if (mid - 1 >= 0 && sequence[mid] - sequence[mid - 1] != diff) {
				return sequence[mid - 1] + diff;
			} else if (sequence[mid] - sequence[0] != (mid - 0) * diff) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}

	public void missingNo(int[] seq) {
		int temp;
		int arr[] = null;
		for (int i = 0; i < seq.length; i++) {
			if (i == seq.length - 1)
				break;
			arr = new int[seq.length];
			int diff = seq[i + 1] - seq[i];
			System.out.println("diff is : " + diff);
			al.add(diff);
		}
		System.out.println(al);

		System.out.println("Count all with frequency");

		// Set<Integer> set = new HashSet<Integer>(al);
		for (Integer r : al) {
			System.out.println(r + ": " + Collections.frequency(al, r));
			int array[] = null;
			for (int i = 0; i <= al.size(); i++) {
				array[i] = (int) al.get(i);

				int max = array[0];
				int count = 1;
				for (int j = 0; j < array.length; j++) {
					array[i] = al.get(i);
					if (array[j] > max) {
						max = array[i];
						count = 1;
					} else if (array[i] == max) {
						count++;
					}
				}
				System.out.println("The largest number is " + max);
				System.out.println("The occurrence count of the largest number is " + count);
			}
			// output results

		}
	}

	public void missNo(int[] nums) {
		int n = nums.length;
		int sum = ((n + 1) * (n + 2)) / 2;
		for (int i = 0; i < n; i++)
			sum -= nums[i];
		System.out.println(sum);
	}

	public void missingNo2() {
		int[] numbers = { 2, 4, 8 };
		Arrays.sort(numbers);
		int numbersArrayIndex = 0;
		for (int i = 0; i < numbers[numbers.length - 1]; i++) {
			if (i == numbers[numbersArrayIndex]) {
				numbersArrayIndex++;
			} else {
				System.out.println(i);
			}
		}
	}

	public static void assignment() {
		int sum = 0;
		int sum1 = 0;
		List<Integer> number = new ArrayList<Integer>();
		number.add(105);
		number.add(106);
		number.add(108);
//		number.add(125);
//        number.add(5);
//        number.add(6);
//        number.add(7);
//        //number.add(8);
//        number.add(9);
//      
		// size = 8
		// totalsumkiskakarega = 9

		for (int i = 0; i < number.size(); i++) {
			sum = sum + number.get(i);

		}
		System.out.println(sum);

		for (int j = number.get(0); j <= number.get(number.size() - 1); j++) {
			sum1 = sum1 + j;

		}
		System.out.println(sum1);

		System.out.println(sum1 - sum);
	}

	
	
	public static int missingNumber2(int[] sequence) {
		int seq = sequence.length;
		double left = 0, right = seq - 1, num = 0;
		double diff = (sequence[seq - 1] - sequence[0]) / seq;
		while (left <= right) {
			double mid = right - (right - left) / 2;
			double a = 3 - (3 - 0) / 2;
			if (mid + 1 < seq && sequence[(int) (mid + 1)] - sequence[(int) mid] != diff) {
				return (int) (sequence[(int) (mid + 1)] - diff);
			} else if (mid - 1 >= 0 && sequence[(int) mid] - sequence[(int) (mid - 1)] != diff) {
				return (int) (sequence[(int) (mid - 1)] + diff);
			} else if (sequence[(int) mid] - sequence[0] != (mid - 0) * diff) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}

}
