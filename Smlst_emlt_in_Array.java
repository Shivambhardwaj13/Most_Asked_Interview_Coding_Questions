import java.util.Scanner;

public class Smlst_emlt_in_Array {
	public static void main(String[] args) {
		int arr[] = new int[5];
		int min;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		for(int i=0; i<arr.length ; i++)
		{
			arr[i] =sc.nextInt();
		}
		min=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Smallest element  " + min);
	}
}
