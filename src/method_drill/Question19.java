package method_drill;

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
		int[] arr = {1234,2356,23456,23456,123411,12,341,323,1,34,4,6,412};
		System.out.println(getMinValue(arr));
	}
}
