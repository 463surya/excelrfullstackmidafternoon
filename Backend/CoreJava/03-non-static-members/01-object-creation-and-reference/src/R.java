class R

{
	int i;
	public static void main(String[] args)
	{
		R r1 = new R();
		System.out.println("main log1: " + r1.i);
		r1.i =10;
		System.outprintln("main log2: " +r1.i);
		R r2 =r1;
		r2.i =20;
		System.outprintln("main log3: " +r2.i);
		R r3 =r2;
		r3.i =30;
		System.outprintln("main log4: " +r3.i);
		System.outprintln("------------");
		System.outprintln("main log final: "+r1.i + "," + r2.i + "," + r3.i);
	}
}