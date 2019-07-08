
public class StaticVariable {

	static int a = 0;
	public static void main(String[] args) {
		
		int j =0;
		System.out.println("old value " + a);
		while(j<=2) {
		System.out.println(run(a));
		j++;
		}
	}

	private static int run(int i) {
		i++;
		return i;
	}
}
