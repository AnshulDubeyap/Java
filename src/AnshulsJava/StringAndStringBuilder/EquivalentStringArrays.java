package AnshulsJava.StringAndStringBuilder;

public class EquivalentStringArrays {
	// word1 = ["ab", "c"]
	// word2 = ["a", "bc"]
	// output = "abc", true (equal after concatenation)

	// word1 = ["bc" , "a"]
	//word2 = ["a", "bc"]
	// output = false

	public static void main(String[] args) {
		String[] arr = {"ab", "c"};
		String[] brr = {"a", "bc"};

		EquivalentCheck(arr, brr);


	}

	static void EquivalentCheck(String[] arr, String[] brr){
		String str = "";
		String dtr = "";

		for(int i = 0; i< arr.length; i++){
			str = str + arr[i];
		}

		for(int j = 0; j<brr.length; j++){
			dtr = dtr + brr[j];
		}

		if(str.equals(dtr)){
			System.out.println("Yes the Array of Strings are equal");
		}else{
			System.out.println("No they are not equal");
		}
	}
}
