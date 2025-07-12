package AnshulsJava.StringAndStringBuilder;





// try it later







public class Decryption {
//	Input: s = "10#11#12"
//	Output: "jkab"
//	Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2"

//	Input: s = "1326#"
//	Output: "acz"

	public static void main(String[] args) {

		String message = "10#11#12";
		StringBuilder decryption = new StringBuilder();

		for(int i = 0; i<message.length(); i++){
			char ch = message.charAt(i);

			if(ch == '#'){
				StringBuilder str = new StringBuilder();
				str.append(message.charAt(i-2));
				str.append(message.charAt(i-1));

				int num = Integer.parseInt(str.toString());
				char add = (char) ('a' + num - 1);

				decryption.append(add);
			}


		}

		System.out.println(decryption);
	}
}
