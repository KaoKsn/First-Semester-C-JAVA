import java.util.Scanner;
class gettinginput
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = in.nextInt();
		System.out.println("You entered: "+num);
	}
}
