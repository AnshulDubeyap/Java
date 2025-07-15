package AnshulsJava.OOps;

class GrandParent {
	String VillageName;
	String HomeState;

	GrandParent(String VillageName, String HomeState) {
		this.VillageName = VillageName;
		this.HomeState = HomeState;
	}
}

class Parent extends GrandParent {
	String CorporateCity;
	String CorporateName;

	Parent(String VillageName, String HomeState, String CorporateCity, String CorporateName) {
		super(VillageName, HomeState);
		this.CorporateCity = CorporateCity;
		this.CorporateName = CorporateName;
	}
}

class Child extends Parent {
	String CollegeName;
	String CollegeCity;

	Child(String VillageName, String HomeState, String CorporateCity, String CorporateName, String CollegeName, String CollegeCity) {
		super(VillageName, HomeState, CorporateCity, CorporateName);
		this.CollegeName = CollegeName;
		this.CollegeCity = CollegeCity;
	}
}

public class MultiLevelInheritance {
	public static void main(String[] args) {

		GrandParent gp = new GrandParent("Mahagwan", "Madhya Pradesh");
		System.out.println(gp.VillageName + " " + gp.HomeState); // output = Mahagwan Madhya Pradesh

		Parent p = new Parent("Mahagwan", "Madhya Pradesh", "Mumbai", "Powerica limited");
		System.out.println( p.CorporateCity + " " + p.CorporateName); // output = Mumbai Powerica limited

		Child c = new Child("Mahagwan", "Madhya Pradesh", "Mumbai", "Powerica limited", "Rewa Engineering College", "Rewa");
		System.out.println(c.CollegeCity + " " + c.CollegeName); // output = Rewa Rewa Engineering College

	}
}
