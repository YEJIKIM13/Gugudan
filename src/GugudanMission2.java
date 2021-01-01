import java.util.Scanner;

public class GugudanMission2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		String[] inputArray = input.split(",");
		
		int firstNumber = Integer.parseInt(inputArray[0]);
		int secondNumber = Integer.parseInt(inputArray[1]);
		
		for(int i = 2; i <= firstNumber; i++) {
			for(int j = 1; j <= secondNumber; j++) {
				System.out.println(i * j);
			}
		}
		
	}
}
