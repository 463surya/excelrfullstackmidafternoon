class T 
{
	int i;
    static void test(int i)
	{
		i=20;
	}
	public static void main(String[] args) 
	{
		T t1 =new T();
		t1.i =10;

		System.out.println("before calling test(S): " + t1.i);
		T.test(t1.i);
		System.out.println("after calling test(S): " + t1.i);
	}
}
