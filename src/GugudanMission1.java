import java.util.Scanner;

public class GugudanMission1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		
		for(int i = 2; i < number; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i * j);
			}
		}	
		for(int j = 1; j <= number; j++) {
			System.out.println(number * j);
		}
				
		
	}
}
