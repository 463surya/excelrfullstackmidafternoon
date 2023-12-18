class E 
{
	E()
	{
		System.out.println("E()");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	    E e1 = new E();
		E e2 = new E();
		System.out.println("main end");	
}
}
//constructor execution is object-creation wise
//
