
import java.util.Scanner;

public class one {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int w;
		int x;
		int y;
		int z;
		int sum;

		System.out.print("500���� ������ �Է��ϼ���");
		w = input.nextInt();
		System.out.print("100���� ������ �Է��ϼ���");
		x = input.nextInt();
		System.out.print("50���� ������ �Է��ϼ���");
		y = input.nextInt();
		System.out.print("10���� ������ �Է��ϼ���");
		z = input.nextInt();

		sum = 500 * w + 100 * x + 50 * y + 10 * z;
		System.out.println(sum);
	}

}
