class E
{
	static
	{
		i = 1;//but modification is possible before its declaration but not usage

}
static int i = 2;
public static void main(String[] args)
	{
	System.out.println(i);
	}
}