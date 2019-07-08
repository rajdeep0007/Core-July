import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class IntegerComparator {

	public static void main(String[] args) {

		ArrayList<Integer> values = new ArrayList<>();
		values.add(201);
		values.add(478);
		values.add(12);
		values.add(475);

		// for(int value:values) {
		// System.out.println(value);
		// }

		// values.forEach(value -> System.out.println(value));

		Comparator cmpl = new Cmpl();

		Collections.sort(values, cmpl);
		values.forEach(value -> System.out.println(value));

	}

}
