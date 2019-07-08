import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestingCharReturn {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		char c = (char) br.read();
		char c1 = (char)br.read();
		System.out.print(n);
		System.out.print(c);
		System.out.print(c1);
		System.out.print(s);
		
		FileReader file = new FileReader("F:\\abc.txt");
		BufferedReader br1 = new BufferedReader(file);
		
		for(int i=0 ;i<3;i++) {
			System.out.println(br1.readLine());
		}

	}

}
