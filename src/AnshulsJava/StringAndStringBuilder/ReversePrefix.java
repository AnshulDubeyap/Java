package AnshulsJava.StringAndStringBuilder;

public class ReversePrefix {
	// Reverse words from the first occurrence of the target
	//	Input: word = "abcdefd", ch = "d"
	//	Output: "dcbaefd"
	public static void main(String[] args) {

		String str  = "abcdef";
		char ch = 'd';
		int index = 0;
		String result = "";

		for(int i = 0; i<str.length(); i++){
			if(str.charAt(i) == ch){
				index = i;
				break;
			}
		}

		for(int j = 0; j<str.length(); j++){
			if( j < index){
				result = result + str.charAt(j);
			}
			if(j >= index){
				result  = result + str.charAt(str.length()-1-j);
			}
		}

		System.out.println(result);


	}
}
