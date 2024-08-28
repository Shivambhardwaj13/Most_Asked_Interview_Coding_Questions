import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		int a, b, c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number as U wish");
		a =sc.nextInt();
		System.out.println("Enter second number as U wish");
		b =sc.nextInt();

		for(int i=1 ; i<=a ; i++)
		{
			if( a % i == 0 && b % i == 0)
				c = i;
		}
		System.out.println("Greatest Common Divisor =" +c);
	}
}
