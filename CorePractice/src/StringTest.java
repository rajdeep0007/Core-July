
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Hello";
		String s2 = "hello_man";
		String s3 = new String("HelloBuddy");
		System.out.println(s1 == s2);
		System.out.println(System.identityHashCode(s1));

		s1 = s1 + s2 + s3;
		System.out.println(s1);
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println("new length of s1 = "+s1.length());
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s2.compareTo(s3));
	}

}
