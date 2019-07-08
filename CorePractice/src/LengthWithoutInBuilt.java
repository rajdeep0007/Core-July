
public class LengthWithoutInBuilt {

	public static void main(String arg[]) {
		String s ="This is java";
		String[] a =new String[] {s};
		//char[] a = { 't', 'h', 'i', 's', ' ', 'i', 's' };
		int j = 0;
		while (!a[j].equals("\0") ) {
			if (a[j] == "i" && a[j + 1] == "s") {
				System.out.println("print " + j);
				j++;
			}
			j++;
		}
		System.out.println("nai ghusa");
	}
}
