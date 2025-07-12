package AnshulsJava.Searching.BinarySearch;

public class BinarySearch {
	public static void main(String[] args) {

		int[] arr = {12, 13 , 14, 15, 16, 17, 18}; // Sorted Array
		int target = 17;

		int index = Binary(arr, target);

		System.out.println("The element " + target + " is at index : " + index);
	}

	static int Binary(int[] arr, int target){
		int start = 0;
		int end = arr.length - 1;

		while(start <= end){
			int mid = (start + end) / 2;

			if(arr[mid] == target){
				return mid;
			}

			if(arr[mid] > target){
				end = mid - 1;
			}

			if(arr[mid] < target){
				start = mid + 1;
			}
		}

		return -1; // not found
	}
}
