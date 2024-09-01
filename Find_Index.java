public class Find_Index {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		int k = 3;
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			System.out.println(k + " ka index: " + index);
		} else {
			System.out.println(k + " array mein nahi hai.");
		}
	}
}
