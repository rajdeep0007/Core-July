import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReadDifferentValueKeyboard {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s, ",");
		String name = st.nextToken();
		String id = "007";
		
		String name1 = name;
		Long id1 = Long.valueOf(id);
		
		System.out.println("name = "+name1+ " id = "+id1);
		
	}

	
	
}
