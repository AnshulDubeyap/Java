package AnshulsJava.OOps;

// Outside Class can never be a static class, but inside class can be a static class

// class Test2
class Test2{
	String name;

	Test2(String name){
		this.name = name;
	}
}
public class InnerClass {

	// class Test
	class Test{
		String name;

		Test(String name){
			this.name = name;
		}
	}

	// static class Test3
	static class Test3{
		String name;

		Test3(String name){
			this.name = name;
		}
	}



	public static void main(String[] args) {
		// Test obj = new Test("Anshul");
		// error, because the Test is not static, it depends on the InnerClass for object creation

		Test2 obj2 = new Test2("Anshul");
		System.out.println(obj2.name); // output = Anshul, because Test2 does not depend on an InnerClass object

		Test3 obj3 = new Test3("Anshul");
		System.out.println(obj3.name); // output = Anshul, because Test3 does not depend on an InnerClass object (static)

	}

}
