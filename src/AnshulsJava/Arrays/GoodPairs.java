package AnshulsJava.Arrays;

public class GoodPairs {
	public static void main(String[] args) {

		// if( arr[i] == arr[j])  = good pairs
		int[] arr = {12, 13, 12, 13, 17, 14, 17, 12, 14, 90};

		GoodPairsNumbers(arr);

	}

	static void GoodPairsNumbers(int[] brr){
		int count = 0;
		for(int i = 0; i<brr.length; i++){
			for(int j = i+1; j<brr.length; j++){
				if(brr[i] == brr[j]){
					count = count + 1;
				}
			}
		}

		System.out.println("the numbers of good pairs in the array are: "+ count);
	}
}
