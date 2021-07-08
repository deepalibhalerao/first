import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		int x;
		java.util.Scanner sc =new Scanner(System.in);
		System.out.println("Enter an Integer:");
		x=sc.nextInt();
		if(x%2 ==0)
		{
			System.out.println("Number is Even.");
		}
		else
		{
			System.out.println("Number is Odd");
		}

	}

}
