class M
{
	void test1()

{
	System.out.println("from test1");
}
	static 
	{
		M obj = new M();
		obj.test1();
	}	
}
/* till java jdk 1.6 we could be able to run program without main method, 
but from java jdk 1.7 compulsary we should be hyaving the main method to run the class, because JVM will be looking for main methold to run
the class( initialize the class for running).
