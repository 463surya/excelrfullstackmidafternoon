import java.util.Scanner;
class F
{
	public static void main(String[] args) 
	{
		System.out.println("Enter your first name?");
		Scanner sc =new Scanner(System.in);
		String name = sc.next();
		System.out.println("Enter your address?");
		String address = sc.nextLine();
		System.out.println("your name: " + name +"your address: " + address);
	}
  }
