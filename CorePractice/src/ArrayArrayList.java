import java.util.ArrayList;

public class ArrayArrayList {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		//Array can store both object and primitive type but of fixed length
		Bike b = new Bike();
		Bike bike[]= {b};
		System.out.println(bike[0]);
		
		int a[] = {0,1,2};
		String []s = {"x","y"};
		
		
		//length()
		System.out.println(a.length);
		
		//Arraylist can store only obects of flexible length
		//ArrayList can be created with help of wrapper classes
		ArrayList<Integer> value = new ArrayList<>();
		value.add(1);
		
		
		//size()
		System.out.println(value.size());
		
		//cannot make arraylist with primitive datatype
		//ArrayList<int> value1 = new ArrayList<>();
		
		Object o = b;
		Bike c = (Bike)o;
		System.out.println(c);
		
		Bike b1 = (Bike)b.clone();
		System.out.println(b1);
		
		
		
	}
}
