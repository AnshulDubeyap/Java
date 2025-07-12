package AnshulsJava.Arrays;

import java.util.Arrays;

public class RemoveDuplicates {
//	Input: nums = [0,0,1,1,1,2,2,3,3,4]
//	Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
//	Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
//	It does not matter what you leave beyond the returned k (hence they are underscores)

	public static void main(String[] args) {
		int[] arr = {0,0,1,1,1,2,2,3,3,4};

		Duplicates(arr);


	}
	static void Duplicates(int[] arr){
		int[] removed = new int[arr.length];
		int num = 0;


		for(int i = 0; i< arr.length; i++){
			boolean flag = false;
			for(int j = 0; j< removed.length; j++){
				if(arr[i] == removed[j]){
					flag = true;
					break;
				}
			}

			if(!flag){
				removed[num] = arr[i];
				num = num + 1;

			}

		}
		System.out.println(Arrays.toString(removed));

	}
}
