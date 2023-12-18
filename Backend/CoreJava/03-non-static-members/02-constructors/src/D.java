class D 
{
	D()
	{
		System.out.println("D() begin");
		for (inti = 1;i <= 10 ;i++)
		{
			System.out.println("from loop: " + i );
		}
		System.out.println("D() end ");
	}

	public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println("done");
	}
}
//inside the constructor body we can keep any number of statements and any type of valid type of statements
