
public class ComparingObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike b = new Bike();
		b.setCost(100);
		b.setName("Apache");

		Bike b1 = new Bike();
		b.setCost(20);
		b.setName("Duke");

		System.out.println(b.equals(b1)); //false

		int a = 10;
		int d = 10;
		int c = 20;

		// equality operator is used to compare both object and primitives..but equals
		// is used to compare only object
		System.out.println(a == d);//true
		System.out.println(a == c);//false

		Integer i = 260;
		Integer i2 = 260;

		System.out.println(i.equals(i2));//true
		System.out.println(i == i2);//false

		// in this case , the concept of caching comes beacause -10 lies between -127 to
		// 128 for the value of integer so i3 reference suppose 100 so i4 will also
		// refer to 100 in the heap

		Integer i3 = -10; 
		Integer i4 = -10;

		System.out.println(i3.equals(i4)); //true
		System.out.println(i3 == i4); //true

	}

}
