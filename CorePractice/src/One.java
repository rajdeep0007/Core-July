
public class One {

	
/*	public One()
	{
		System.out.println("One constructor");
	}*/
	public static void calculate()
	{
		System.out.println("One");
	}
	
	public void calculate(int n)
	{
		System.out.println("One"+n*n);
	}
	
	private void check()
	{
		System.out.println("inside private");
	}

	public void callPrivate()
	{
		check();
		calculate();
	}
	
	
}


