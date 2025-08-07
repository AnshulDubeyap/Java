package AnshulsJava.OOps.Enemuration;

public enum Laptops {
	Maker(2000), Dell(2200), Lenovo(1200), Macbook(4000), Asus(6000);

	// for every laptop model I want to define a price as well

	// create a constructor and a private variable
	private int price;

	private Laptops(int price) {
		this.price = price;
	}

	// getter method (we can create a getter method for every private variable)
	public int getPrice() {
		return price;
	}

	// setter method (we can create a setter method for every private variable)
	public void setPrice(int price) {
		this.price = price;
	}






}
