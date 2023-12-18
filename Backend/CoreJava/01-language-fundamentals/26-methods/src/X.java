class X
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(test() + test());//it first prints from test and again return value 100 so it ll become 100+100
		System.out.println("main end");
	}
	static int test()
	{
		System.out.println("from test");
		return 100;
    }
}