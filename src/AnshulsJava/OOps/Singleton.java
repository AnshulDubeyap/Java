package AnshulsJava.OOps;

public class Singleton {
	// Class can have only one object
	private static class SingletonClass{
		int a;
		int b;

		SingletonClass(int a, int b){
			this.a = a;
			this.b = b;
		}

	}
	public static void main(String[] args) {

		SingletonClass obj = new SingletonClass(10, 20);

	}
}
