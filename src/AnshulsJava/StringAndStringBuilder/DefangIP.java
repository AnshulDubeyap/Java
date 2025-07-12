package AnshulsJava.StringAndStringBuilder;

public class DefangIP {
	// A defanged IP address replaces every period "." with "[.]"

//	Input: address = "1.1.1.1"
//	Output: "1[.]1[.]1[.]1"

	public static void main(String[] args) {
		String address = "1.1.1.1";
		String defang = "";

		for(int i = 0; i<address.length(); i++){
			char ch = address.charAt(i);
			if(ch == '.'){
				defang = defang + "[.]";
			}else{
				defang = defang + ch;
			}

		}

		System.out.println(defang);

	}
}
