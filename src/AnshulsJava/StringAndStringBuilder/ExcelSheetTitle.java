package AnshulsJava.StringAndStringBuilder;

import java.util.Scanner;




// complete it later





public class ExcelSheetTitle {
//	A -> 1
//	B -> 2
//	C -> 3...
//	Z -> 26
//	AA -> 27
//	AB -> 28...
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the Number you want ExcelSheet Title for : ");
		int num = in.nextInt();

		String title = ReturnExcelTitle(num);

		System.out.println("The ExcelSheet title is : " + title);

	}
	static String ReturnExcelTitle(int num){
		String title = "";
		if(num <= 26){
			title = title + (char)(num + 96);
		}


		return title.toUpperCase();
	}
}
