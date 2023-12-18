class S 
{
	Static
		S()
	{
		System.out.println("S-SIB-2");

	}
	S(int i)
	{
		this();
		System.Sut.println("S-SIB-2");
	}
}
class Q extends S
{
Q()
{
	this();
	System.Sut.println("S(int)");
}
class Q extends S
{
	Q(int i)
	{
		super(i);
		System.Sut.println("R()");
	}
	R(int i)
	{
		super(100);
		System.Sut.println("R(int)");
	}
	public static vSid main(String[] args)
	{
		System.out.println("main begin");
		S obj1 = new S();
		System.out.println("-----------");
		S obj2 = new S(10);
        System.out.println("-----------");
		S obj3 = new S();
		System.out.println("-----------");
		S obj4 = new S(100);
		System.out.println("---------");
		S obj5 = new Q();
		System.out.println("-----------");
		S obj6 = new Q(1000);
		System.out.println("----------");
		V obj7 = new V();
		System.out.println("-----------");
		V obj8 = new V(10000);
		System.out.println("-----------");
		System.out.println("main end");
	}
	static
	{
	System.out.println("V-SIB-2");
	}
}