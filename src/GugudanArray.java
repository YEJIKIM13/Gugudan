
public class GugudanArray {
	
	public static void main(String[] args) {
		int[] resultArray = new int[9];
	
		for(int i = 2; i < 10; i++) {
			for(int j = 0; j < resultArray.length; j++) {
				resultArray[j] = i * (j+1);
			}
			for(int j = 0; j < resultArray.length; j++) {
				System.out.println(resultArray[j]);
			}
		}
	}
}
