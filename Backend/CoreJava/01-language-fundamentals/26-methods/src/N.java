class N 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (true)
		{
		System.out.println("from if");
		return;//immediately if return comes it has to return on top.
	}
	System.out.println("main end");//doesnt care this if return is there
}
}
//out put will be
//main begin 
//from if