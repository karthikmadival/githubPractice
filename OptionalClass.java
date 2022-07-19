package maven_pr;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		Person person = new Person("Karthik", "Karthik@gmail.com");
		/*
		 * if (!person.getemail().isEmpty()) {
		 * System.out.println(person.getemail().get().toUpperCase()); } else {
		 * System.out.println("emil is blank"); }
		 */

		String email = person.getemail().map(String :: toLowerCase).orElse("emaili is null");
		System.out.println(email);
	}

}

class Person {

	private String name;
	private String email;

	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getname() {
		return name;
	}

	public Optional<String> getemail() {
		return Optional.ofNullable(email);
	}
}