package AnshulsJava.OOps.AccessModifiers;

class Anshul1 extends Anshul {
	int AadharNo;

	Anshul1(String Firstname, int age, String city, int AdharNo) {
		super(Firstname, age, city);
		this.AadharNo = AdharNo;
	}

	public static void main(String[] args) {
		Anshul1 anshul = new Anshul1("Anshul", 21, "Delhi", 1234567890);

		System.out.println(anshul.Firstname); // output = Anshul (can access public in the same package)
		// System.out.println(anshul.age); //error, private can be accessed only in the same class it defined
		System.out.println(anshul.city); // output = Delhi, (can access protected in the same package)
		System.out.println(anshul.AadharNo);
	}

}
