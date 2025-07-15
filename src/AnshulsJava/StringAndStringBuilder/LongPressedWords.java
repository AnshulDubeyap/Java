package AnshulsJava.StringAndStringBuilder;

public class LongPressedWords {
//	Input: name = "alex", typed = "aaleex"
//	Output: true

//	Input: name = "saeed", typed = "ssaaedd"
//	Output: false (e is pressed only once)

	public static void main(String[] args) {
		String str = "saeed";
		String typed = "ssaaedd";

		CheckLongPressedWords(str, typed);

	}

	static void CheckLongPressedWords(String str, String typed){
		boolean flag = true;
		for(int i = 0; i<str.length(); i++){
			int count = 0;
			int num = 0;
			for(int k = i; k<str.length(); k++){
				if(str.charAt(i) == str.charAt(k)){
					num = num + 1;
				}
			}
			for(int j = 0; j<typed.length(); j++){
				if(str.charAt(i) == typed.charAt(j)){
					count = count + 1;
				}
			}

			if(count == num || count > num){
				flag = true;
			}

			if(count < num){
				flag = false;
				break;
			}

		}

		if(flag){
			System.out.println("Yes the String is long pressed");
		}else{
			System.out.println("No the String is not long pressed");
		}
	}
}
