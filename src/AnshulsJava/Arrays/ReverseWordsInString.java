package AnshulsJava.Arrays;

import java.util.Arrays;

public class ReverseWordsInString {

	//Input = ["Hello", "World"]
	// Output = [ 'olleH', 'dlroW' ]

	public static void main(String[] args) {
		String[] arr = {"Anshul", "Dubey", "Hello", "World"};

		ReverseWords(arr);


	}

	static void ReverseWords(String[] arr){
		String rev[] = new String[arr.length];
		int n = 0;
		for(int i = 0; i<arr.length; i++){
			String str = arr[i];
			String revs = "";
			for(int j = 0; j<str.length(); j++){
				revs = revs + str.charAt(str.length()-1-j);
			}
			rev[n] = revs;
			n = n+1;
		}

		System.out.println(Arrays.toString(rev));
	}
}
