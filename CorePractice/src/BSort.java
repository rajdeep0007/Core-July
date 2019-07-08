import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BSort {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter total number of values");
		int n = Integer.parseInt(br.readLine());

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter numbers");
			arr[i] = Integer.parseInt(br.readLine());
		}

		int limit = n - 1;
		int temp = 0;
		boolean flag = false;
		for (int i = 0; i < limit; i++) {
			for (int j = 0; j < limit - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}
			if (flag == false)
				break;
			else
				flag = false;
		}

		for (int i = 0; i < n; i++)
			System.out.println(arr[i]);

	}

}
