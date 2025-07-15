package AnshulsJava.StringAndStringBuilder;

public class Decryption {
//	Input: s = "10#11#12"
//	Output: "jkab"
//	Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2"

//	Input: s = "1326#"
//	Output: "acz"

	public static void main(String[] args) {

		String message = "10#11#12";

		String decrypt = DecryptString(message);

		System.out.println(decrypt);

	}
	static String DecryptString(String message){
		String decrypt = "";

		for(int i = 0; i<=message.length(); i++){
			char ch = message.charAt(i);

			if(ch == '#'){
				int num = 2;
				String dh = "";
				while(num > 0){
					dh = dh +  message.charAt(i-num);
					num = num - 1;
				}
				int charNum = Integer.parseInt(dh);
				char eh = (char)(charNum + 96);

				decrypt = decrypt + eh;
			}

			if(message.charAt(i) != '#' && i == message.length() ){
				int count = 0;
				int num = message.length() - 1;
				int num2 = message.length() - 1;
				String dh = "";
				while(message.charAt(num) != '#'){
					count++;
					num--;
				}

				for(int j = 0; j<= count; j++){
					dh = dh + message.charAt(num2);
				}
				int charNum = Integer.parseInt(dh);
				char eh = (char)(charNum + 96);
				decrypt = decrypt + eh;

			}



		}

		return decrypt;
	}
}
