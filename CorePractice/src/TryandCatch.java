
 class TryandCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x= 0/5;
			System.exit(1);
			
		}
		catch(Exception e)
		{
			System.out.println("in catch");
		}
		finally
		{System.out.println("in finally");
		return;
		}
		
	}

}
