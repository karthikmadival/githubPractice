package maven_pr;

public class Emplyee {

	String name;
	int age;

	public Emplyee(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public static void main(String[] args) {
		Emplyee em = new Emplyee("karthik", 18);
		Emplyee gm = new Emplyee("karthik", 18);
		Emplyee dm = gm;
		
		System.out.println(em.hashCode());
		System.out.println(gm.hashCode());
		System.out.println(dm);
		System.out.println(gm.equals(dm));

		System.out.println(gm.equals(em));

		
	}

	public String toString() {
		// TODO Auto-generated method stub
		return ("name= " + name + " age= " + age);
	}

}
