package AnshulsJava.Arrays;

public class EvenDigits {
	public static void main(String[] args) {
		// [12, 123, 564, 9223], 2 numbers with even number of digits

		int[] arr = {123, 465, 8717, 95763, 56, 45, 33};

		CheckEvenDigits(arr);
	}

	static void CheckEvenDigits(int[] brr){
		int evenDigitNum = 0;
		 for(int i = 0; i<brr.length; i++){
			 int num = brr[i];
			 int count = 0;

			 while(num > 0){
				 count = count + 1;
				 num = num/10;
			 }

			 if(count % 2 == 0){
				evenDigitNum = evenDigitNum+1;
			 }
		 }

		System.out.println("The number of numbers with even digits are : " + evenDigitNum);
	}
}
