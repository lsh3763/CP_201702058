
import java.util.Scanner;

public class one {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		int mile;
		double km;

		System.out.println("������ �Է��ϼ���");
		mile = input.nextInt();

		km = mile * 1.609;

		System.out.println(km);

	}

}