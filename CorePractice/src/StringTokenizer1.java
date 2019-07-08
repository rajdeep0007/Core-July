import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringTokenizer1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter details separating comma");
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s, ",");
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		String s3 = st.nextToken();

		String name = s1;
		int id = Integer.parseInt(s2);
		float salary = Float.parseFloat(s3);

		System.out.println("Details are = " + name + " , " + id + " , " + salary);
	}

}
