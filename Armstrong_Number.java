import java.util.Scanner;

public class Armstrong_Number {
	public static void main(String[] args) {
		int num , temp , rem , sum=0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		num=sc.nextInt();
		temp=num;
		while(num>0){
			rem=num%10;
			num=num/10;
			sum = sum + rem * rem * rem;
		}
		if (temp == sum)
			System.out.println("Armstrong Number");
		else
			System.out.println(" not Armstrong Number");


	}
}
