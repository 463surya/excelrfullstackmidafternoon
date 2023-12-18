class o 
{
	o()
	{
		System.out.println("o()");

	}
	o(int i)
	{
		this();
		System.out.println("o(int i)");
	}
}
class Q extends P
{
Q()
{
	this();
	System.out.println("P(int)");
}
class Q extends P
{
	Q(int i)
	{
		super(i);
		System.out.println("R()");
	}
	R(int i)
	{
		super(100);
		System.out.println("R(int)");
	}
	public static void main(String[] args)
	{
		System.out.println("main begin");
		o obj1 = new o();
		System.out.println("-----------");
		o obj2 = new o(10);
        System.out.println("-----------");
		o obj3 = new P();
		System.out.println("-----------");
		o obj4 = new P(100);
		System.out.println("done");
		o obj5 = new Q();
		System.out.println("-----------");
		o obj6 = new Q(1000);
		System.out.println("done");
		o obj7 = new R();
		System.out.println("-----------");
		o obj8 = new R(10000);
		System.out.println("-----------");
		System.out.println("main end");
	}
}