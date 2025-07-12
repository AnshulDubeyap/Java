package AnshulsJava.Searching.LinearSearch;

public class WealthiestPerson {
	// 3 persons with different bank accounts with different wealth
	// person 1 with 5 accounts in 5 different banks with [50,000, 30,000, 12,000, 8000, 46,000]
	// person 2 with 3 accounts in 3 different banks with [120,000, 30,000, 10,000]
	// person 3 with 4 accounts in 4 different banks with [920,000, -30,000, -800,000]
	// Find who is wealthiest

	public static void main(String[] args) {
		int[][] arr = {{50000, 30000, 12000, 8000, 46000},{
			120000, 30000, 10000
		},{920000, -30000, -800000}};


		FindWealthiest(arr);


	}

	static void FindWealthiest(int[][] arr){
		int wealth = Integer.MIN_VALUE; // initialize the wealth with the smallest value

		int person = 0;
		for(int row = 0; row< arr.length; row ++){
			int sum = 0;
			for(int col = 0; col < arr[row].length; col++){
				sum = sum + arr[row][col];
			}
			if(sum > wealth){
				wealth = sum;
				person = row;
			}

		}

		System.out.println("The richest person is : "+ person + " with the wealth of : " + wealth);

	}
}
