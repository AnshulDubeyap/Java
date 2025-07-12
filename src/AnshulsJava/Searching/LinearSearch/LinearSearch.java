package AnshulsJava.Searching.LinearSearch;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = {12, 13, 14, 15, -1, 90, 43, -65};
		int target = 90;

		int index = LinearSearching(arr, target);

		if(index == -1){
			System.out.println("The element not found");
		} else {
			System.out.println("The element is at index : " + index);
		}
	}

	static int LinearSearching(int[] arr, int target){
		if(arr.length <= 0){
			return -1;
		}

		for(int i = 0; i < arr.length; i++){
			if(arr[i] == target){
				return i;
			}
		}

		return -1; // If not found after checking all elements
	}
}
