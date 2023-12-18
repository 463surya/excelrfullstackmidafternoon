class V 
{
	static int i;                
	                                    
										//we cannot use unary operators during declaring
	static int j = i++ + i;
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
}
