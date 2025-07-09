package AnshulsJava.Arrays;

public class TwoSum {
//	Input: nums = [2,7,11,15], target = 9
//	Output: [0,1]
//	Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]

	public static void main(String[] args) {

		int[] arr = {2, 7, 11, 15};
		int target = 9;

		TwoSumNumbers(arr, target);

	}

	static void TwoSumNumbers(int[]arr, int target) {
		for(int i = 0; i< arr.length; i++){
			for(int j = i+1; j< arr.length; j++){
				if(arr[i] + arr[j] == target){
					System.out.println("The index pairs are : "+ i + j);
				}
			}
		}

	}

}
