import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Tokenizer {
//code to remove spaces without using charat or any string function
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		while (st.hasMoreTokens()) {
			String s1 = st.nextToken();
			System.out.print(s1.trim());
		}

	}

}
