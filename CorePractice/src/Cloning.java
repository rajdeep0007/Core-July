
public class Cloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		Abc obj = new Abc();
		obj.i = 5;
		obj.j = 6;
		System.out.println(obj);

		// Shallow Copy
		Abc obj1 = obj;
		System.out.println(obj1);

		// Deep Copy
		Abc obj2 = new Abc();
		obj2.i = obj.i;
		obj2.j = obj1.j;
		System.out.println(obj2);

		// Cloning
		Abc obj3 = (Abc) obj.clone();
		System.out.println(obj3);
	}

}

class Abc implements Cloneable {

	int i;
	int j;

	@Override
	public String toString() {
		return "Abc [i=" + i + ", j=" + j + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (Abc) super.clone();

	}
}
