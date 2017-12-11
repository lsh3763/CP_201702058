
import java.util.Scanner;

public class two {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		double F;
		double C;

		System.out.println("화씨를 입력하세요");
		F = input.nextDouble();

		C = (F - 32) * 5 / 9;

		System.out.println(C);
	}

}
