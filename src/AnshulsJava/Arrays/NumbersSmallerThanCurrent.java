package AnshulsJava.Arrays;

public class NumbersSmallerThanCurrent {
	public static void main(String[] args) {
		int[] arr = {12, 43, 82,  9, 13, 103, 7, 2, 11};

		SmallerNumbers(arr);

	}

	static void SmallerNumbers(int[] brr){
		for(int i = 0; i<brr.length; i++){
			int count = 0;
			for(int j = 0; j< brr.length; j++){
				if(brr[j] < brr[i]){
					count = count + 1;
				}
			}

			System.out.println("The count of numbers smaller than "+ brr[i] +" is : "+ count);
		}
	}
}
