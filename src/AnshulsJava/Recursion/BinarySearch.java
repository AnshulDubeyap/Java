package AnshulsJava.Recursion;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int target = 5;
		int index = BinarySearch(arr, target, 0, arr.length - 1);
		System.out.println("The index of " + target + " is : " + index);
	}

	static int BinarySearch(int[] arr, int target, int start, int end) {

		if (start > end) {
			return -1;
		}

		int mid = (start + end) / 2;
		if (arr[mid] == target) {
			return mid;
		} else if (arr[mid] < target) {
			return BinarySearch(arr, target, mid + 1, end);
		} else {
			return BinarySearch(arr, target, start, mid - 1);
		}
	}
}
