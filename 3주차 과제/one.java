
import java.util.Scanner;

public class one {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		double number1;
		double number2;
		double number3;
		System.out.print("첫번째 숫자: ");
		number1 = input.nextDouble();
		System.out.print("두번째 숫자: ");
		number2 = input.nextDouble();
		System.out.print("세번째 숫자: ");
		number3 = input.nextDouble();	

		if (number1 < number2 & number2 < number3) {
			System.out.println(number1);
			System.out.println(number2);
			System.out.println(number3);
		} else if (number1 < number3 & number3 < number2) {
			System.out.println(number1);
			System.out.println(number3);
			System.out.println(number2);
		} else if (number2 < number1 & number1 < number3) {
			System.out.println(number2);
			System.out.println(number1);
			System.out.println(number3);
		} else if (number2 < number3 & number3 < number1) {
			System.out.println(number2);
			System.out.println(number3);
			System.out.println(number1);
		} else if (number3 < number1 & number1 < number2) {
			System.out.println(number3);
			System.out.println(number1);
			System.out.println(number2);
		} else if (number3 < number2 & number2 < number1) {
			System.out.println(number3);
			System.out.println(number2);
			System.out.println(number1);
		}
	}

}
