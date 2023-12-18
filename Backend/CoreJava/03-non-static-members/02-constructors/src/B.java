class B 
{
	B()
	{
	}
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println("Done");
	}
}
//we can also create the constructor 
//constructor should be within a class and outside of any method
//if you are keeping atleast one explicite constructor then , compiler will not be keeping no-arg default constructor.
/*constructors treated as a special type of methods but they are not methods internally,
but they are not normal methods. there is a difference b/w constructors and methods*/
//constructors are going to be invoked while we are creating the object
//methods are going to be invoked whenever we call them.
//compulsary there shld we an object creation to invoke the constructors in the beginning.
//compulsary constructors name shld be same as class name rules for constructors compulsory.
//1. compulary constructors name shld be same as class name(case-sensitive).
//2.there is no return type a constructor.
//3.compulsary constructors shld be concrete or defined or implemented,it shld be having atleast  {} i,e body.
// what are all the similarities between constructor and methods
//parameter(can be anything ,any nos of parameters , any type of parameters
//both shld be having body
//concrete, defined ,implemented
//access specifier both
//we can create any no .of constructors and methods in a class but arguments must be different(for a group of constructors, for a group of methods)
//