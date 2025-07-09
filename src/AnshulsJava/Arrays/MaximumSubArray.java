package AnshulsJava.Arrays;

public class MaximumSubArray {
//	Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//	Output: 6
//	Explanation: The subarray [4,-1,2,1] has the largest sum 6.

	public static void main(String[] args) {
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

		MaximumSum(arr);

	}

	static void MaximumSum(int[] arr){

		int max = arr[0];
		for(int i = 0; i< arr.length; i++){
			int sum = 0;
			for(int j = i; j< arr.length; j++){
				sum = sum + arr[j];
				if(sum > max){
					max = sum;
				}
			}

		}
		System.out.println(max);

	}
}
