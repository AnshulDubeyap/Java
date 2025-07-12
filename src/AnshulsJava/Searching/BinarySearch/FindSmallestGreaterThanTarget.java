package AnshulsJava.Searching.BinarySearch;

public class FindSmallestGreaterThanTarget {
//	Input: letters = ["c","f","j"], target = "a", Sorted Array
//	Output: "c"
//	Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'

	public static void main(String[] args) {
		char[] arr = {'a', 'd', 'f', 'i', 'k','l','p','s','v'};
		char target  = 'r';

		char res = FindCharcter(arr, target);

		System.out.println(res);
	}
	static char FindCharcter(char[] arr, char target){
		int start =  0;
		int end = arr.length -1;

		while(start <= end){
			int mid = (start + end)/2;

			if(target < arr[mid]){
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}

		if (start == arr.length) {
			return arr[0];
		}

		return arr[start];
	}

}
