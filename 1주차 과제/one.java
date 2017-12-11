
import java.util.Scanner;

public class one {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		int mile;
		double km;

		System.out.println("마일을 입력하세요");
		mile = input.nextInt();

		km = mile * 1.609;

		System.out.println(km);

	}

}