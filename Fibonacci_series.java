import java.util.Scanner;

public class Fibonacci_series {
	public static void main(String[] args) {
		int term , a=0 , b=1 , c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a term as U wish");
		term=sc.nextInt();
		for(int i=1 ; i<=term ; i++ ){
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
		}
	}
}
