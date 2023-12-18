class L 
{
	L(int i)
	{
	System.out.println("L(int)"); 
	}
	L(boolean b)
	{
		System.out.println("L(boolean)");
	}
	public static void main(String[] args)
	{
		L 11 =new L(10);
		System.out.println("------------");
		L 12 = new L(true);
		System.out.println("------------");
	}
}

