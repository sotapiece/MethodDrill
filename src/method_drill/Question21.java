package method_drill;

public class Question21 {
	static String getLongestString(String[] array) {
		int max = 0;
		String ans = null;
		for(int i = 0; i<array.length; i++) {
			if(max<=array[i].length()) {
				max = array[i].length();
			}
		}
		for(int i = 0; i<array.length; i++) {
			if(max == array[i].length()) {
				ans = array[i];
			}
		}
		
		return ans;
	}
	
	public static  void main(String[] args) {
		String[] s = {"りんご","ぶどう","メロン","さくらんぼ","パイナップル","もも"};
		System.out.println("一番文字数が多いのは\""+getLongestString(s)+"\"");
	}
}
