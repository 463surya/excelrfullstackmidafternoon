class Dog 
{
	//properties , attributes, data memebers, fields
	String name, breed, gender;
	int age;
	double height, weight;

Dog(String dogName, String dogBreed, String doggender, String dogcolor,int dogage, double dogheight, double dogweight)
	{
	System.out.println("initializing dog object");
	name = dogName;
	breed = dogBreed;
	gender = dogGender;
	color = dogcolor;
	age = dogAge;
	height = dogheight;
	weight = dogweight;
    System.out.println("initializing dog object: completed");
	}
//behaviours
void bark()
	{
	System.out.println("this dog barks!");
	}
	void bite()
	{
		System.out.println("this dog bites!!");
	}

	public static void main(String[] args) 
		{
		System.out.println("main begin");
		Dog d1 = new Dog("charlie","lab", "male", "brown",2,2.8,5.8);
		Dog d2 = new Dog("pinky","lab", "female", "black",3,3.8,4.8);
		System.out.println("Name: "+ d1.name + "Breed: " + d1.breed + "Gender: "+ d1.gender +"Color: " + d1.color + "Age: " + d1.age + "Height: " + d1.height + "weight: " + d1.weight);

		System.out.println("main end");
	}
}