calss A
{
	public static void main (string[] args)
	{
		int i;
		for (i=0;i<0;i++)
		{
			System.out.println("loop begin: " + i);
			if (i>5)
			{
				continue;
			}
			System.out.println("loop end: "+ i);
		}
		System.out.println("main end: "+ i);
	}
}