class U
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
	static int test()
	{
		System.out.println("from test begin");
		if (true)//if false it ll return 200 
		{
		return 100;//if true it ll return value 100 
	}
	System.out.println("from test end");
	return 200;
}
}