package AnshulsJava.Sorting.SelectionSort;

public class Main {
	// Selection Sort is better than Bubble Sort, but worse than Insertion Sort
	// we are not swapping the adjacent elements every time like bubble sort
	// we are selecting the smallest number and swapping it with the first element


	public static void main(String[] args) {
		// Selecting the smallest number and swapping it with the first element

		int[] nums = { 5, 3, 8, 1, 2, 4, 7, 6, 9, 0 };

		System.out.println("Before sorting");
		for (int num : nums) {
			System.out.print(num + " ");
		}

		for(int i = 0; i<nums.length; i++){
			int minIndex = i;

			// get the max number in the array
			for(int j = i + 1; j<nums.length; j++){
				if(nums[j] < nums[minIndex]){
					minIndex = j;
				}
			}

			// swap with first index

			int temp = nums[minIndex];
			nums[minIndex] = nums[i];
			nums[i] = temp;

		}

		System.out.println("\nAfter sorting");
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}
}
