
public class GugudanMethod {

	static int[] resultArray = new int[9];
	public static int[] calculate(int times) {
		for(int i = 0; i < resultArray.length; i++) {
			resultArray[i] = times * (i+1);
		}
		return resultArray;
	}
	public static void print(int[] resultArray) {
		for(int i = 0; i < resultArray.length; i++) {
			System.out.println(resultArray[i]);
		}
	}
	
	public static void main(String[] args) {
	
		for(int n = 2; n < 10; n++) {
			calculate(n);
			print(resultArray);
		}
		
	}
}
