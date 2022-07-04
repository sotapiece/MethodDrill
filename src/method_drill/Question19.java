package method_drill;
import java.util.Scanner;

public class Question19 {
	static int getMinValue(int[] array) {
		int min = array[0];
		for(int i = 0; i<array.length; i++) {
			if(min >= array[i]) {
				min = array[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("配列の要素数は？");
		int n = sc.nextInt();
		System.out.println(n+"個の数字を入力してください");
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("最小値は"+getMinValue(arr)+"です");
	}
}
