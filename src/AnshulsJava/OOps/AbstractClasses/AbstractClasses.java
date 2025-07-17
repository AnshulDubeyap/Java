package AnshulsJava.OOps.AbstractClasses;


public class AbstractClasses {
	public static void main(String[] args) {

		Son son = new Son(28);
		Daughter daughter = new Daughter(29);
		son.career(); // output = Software Developer is my career
		son.partner(); // output = Jimmy is my partner, and they are 28 years old
		daughter.career(); // output = Coder is my career
		daughter.partner(); // output = Cambam is my partner, and they are 27 years old
	}
}
