package method_drill;

public class Question11 {
	static String getWeatherForecast() {
		int n = (int)(3*Math.random());
		int s = (int)(3*Math.random());
		
		String[] t = {"今日","明日","明後日"};
		String[] w = {"晴れ", "曇り","雨","雪"};
		
		return t[n]+"の天気は"+w[s]+"でしょう";
	}
	
	public static void main(String[] args) {
		System.out.println(getWeatherForecast());
	}
}
