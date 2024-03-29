
public class Person {
	private int id;
	private String firstName;
	private String lastName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null || obj.getClass() != this.getClass())
			return false;
		Person person = (Person) obj;
		return id == person.getId()
				&& (firstName == person.getFirstName() || firstName != null && firstName.equals(person.getFirstName()))
				&& (lastName == person.getLastName() || lastName != null && lastName.equals(person.getLastName()));

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	public static void main(String[] args) {

		Person p = new Person();
		p.setFirstName("raj");
		Person obj = new Person();
		obj.setFirstName("raj");
		System.out.println(p.equals(obj));
	}

}
