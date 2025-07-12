package AnshulsJava.StringAndStringBuilder;

public class ParserInterpretation {
		//G -> G
		//() -> o
		//(al) -> al
		public static void main(String[] args) {
			String command = "G()()()()(al)";
			String parser = "";

			for(int i = 0; i<command.length(); i++){

				if(command.charAt(i) == 'G'){
					parser = parser + 'G';
				}

				if(command.charAt(i) == '(' && command.charAt(i + 1) == ')'){
					parser = parser + 'o';
				}

				if(command.charAt(i) == '(' && !(command.charAt(i + 1) == ')')){
					parser = parser + "al";
				}

			}

			System.out.println(parser);

		}
}
