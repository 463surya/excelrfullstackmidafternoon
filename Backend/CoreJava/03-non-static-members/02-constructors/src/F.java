class F 
{
	int i;
	F()
	{
		System.out.println("F()");
		i = 10;
	}
	public static void main(String[] args) 
	{
		F f1 = new F();
		System.out.println(f1.i);
	}
}
//what is the need of a constructors ?
//constructors are used to initialize objects
//non static members can be used without any reference variable in the non-static context.
//