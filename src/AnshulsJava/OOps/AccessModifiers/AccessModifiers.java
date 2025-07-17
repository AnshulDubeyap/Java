package AnshulsJava.OOps.AccessModifiers;


public class AccessModifiers {
	public static void main(String[] args) {

		Anshul anshul = new Anshul("Anshul", 21, "Delhi");
		System.out.println(anshul.Firstname); // output = Anshul (can access public in the same package)
		// System.out.println(anshul.age); // error, because age is private
		System.out.println(anshul.city); // output = Delhi, (can access protected in the same package)


		// Conclusion:
		// public access modifier can be accessed anywhere
		// private access modifier can only be accessed anywhere in the same class
		// protected access modifier can be accessed within the same package and in subclasses (even if the subclass is in another package)
		// if you want to access the protected in another package, use only subclass (parent class (where protected is defined) will not give access)
		// If no access modifier is specified, it is only accessible within the same package (not even in subclasses in another package)

	}
}

