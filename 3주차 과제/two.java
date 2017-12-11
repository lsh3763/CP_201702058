
import java.util.Scanner;

public class two {
	public static void main(String args[]) {
		double 키;
		double 몸무게;
		double 표준체중;
		double A, B;
		Scanner input = new Scanner(System.in);
		System.out.print("키: ");
		키 = input.nextDouble();
		표준체중 = (키 - 100) * 0.9;
		System.out.println(표준체중);
		System.out.print("몸무게: ");
		몸무게 = input.nextDouble();
		A = 표준체중 + 표준체중 * 0.1;
		B = 표준체중 - 표준체중 * 0.1;

		if (몸무게 >= B & 몸무게 <= A) {
			System.out.println("정상체중 입니다.");
		}

		else if (몸무게 < B) {
			System.out.println("저체중 입니다.");
		} else if (몸무게 > A) {
			System.out.println("과체중입니다.");
		}

	}

}
