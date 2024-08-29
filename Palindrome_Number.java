import java.util.Scanner;

public class Palindrome_Number {
	public static void main(String[] args) {
		int num ,rem , rev=0 , org_num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		num = sc.nextInt();
		org_num = num;

		while(num>0){
			rem = num %10;
			rev = rev * 10 + rem;
			num = num /10;
		}
		if(org_num==rev)
			System.out.println(org_num + " Palindrome");
		else
			System.out.println(org_num + " Not Palindrome");

	}
}
