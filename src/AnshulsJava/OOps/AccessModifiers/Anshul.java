package AnshulsJava.OOps.AccessModifiers;

class Anshul {
	public String Firstname; // public access modifier
	private int age; // private access modifier
	protected String city; // protected access modifier

	Anshul(String Firstname, int age, String city) {
		this.Firstname = Firstname;
		this.age = age;
		this.city = city;
	}

	public static void main(String[] args) {
		Anshul anshul = new Anshul("Anshul", 21, "Delhi");

		System.out.println(anshul.Firstname); // output = Anshul (can access public in the same package)
		System.out.println(anshul.age); // output = 21 (can access private in the same package)
		System.out.println(anshul.city); // output = Delhi, (can access protected in the same package)
	}
}
