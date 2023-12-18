class K 
{
	static int x= 0;
	static void test1()
	{
		
		System.out.println("test1: " + x);
		x = 1;
	}
	static void test2()
	{
		System.out.println("test2: " + x);
		x = 2;
	}
	public static void main(String[] args) 
	{
		test1();
		System.out.println("main: "+ x);
		test2();
		System.out.println("main: "+ x);
	}
}
