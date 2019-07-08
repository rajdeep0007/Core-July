
public class Two extends One {

	public Two() {
		System.out.println("Two constructor");
	}

	public Two(String s) {
		System.out.println("Two String constructor");
	}

	public static void calculate() {
		System.out.println("Two");
	}

	public void calculate(int n) {
		System.out.println("Two" + n * n * n);
	}

	public static void main(String arg[]) {

		// as soon as the object is called for the parent class by default its
		// constructor will be called
		One one1 = new One();
		one1.calculate(10);

		// even if again the object of 1st is call , its default constructor will be
		// called plus the second class constructor is called

		// As soon as instance of 2 is made it will first call the default constructor
		// of 1
		One one = new Two();
		one.calculate(10);

	}
}
