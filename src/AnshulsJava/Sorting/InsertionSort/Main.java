package AnshulsJava.Sorting.InsertionSort;

public class Main {

	public static void main(String[] args) {
		int[] nums = {3, 2, 6, 4, 8, 5, 9, 23, 0, 7 ,1};

		System.out.println("\nAfter sorting");
		for (int num : nums) {
			System.out.print(num + " ");
		}

		for(int i = 0; i<nums.length; i++){
			int key = nums[i];
			int j = i - 1;

			while(j >= 0 && nums[j] > key){
				nums[j + 1] = nums [j];
				j--;
			}

			nums[j + 1]  = key;
		}

		System.out.println("\nAfter sorting");
		for (int num : nums) {
			System.out.print(num + " ");
		}


	}
}
