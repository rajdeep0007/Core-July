
public class BreakContinueReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				 //break;
				//continue;
				 return;
			}
			System.out.println(i);
		}
	}
}
/*
//output in case of break
0
1
2
*/
/*output in case of continue
0
1
2
4
*/
/*
//output in case of return
0
1
2
*/