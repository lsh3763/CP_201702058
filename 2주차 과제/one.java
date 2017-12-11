
import java.util.Scanner;

public class one {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int w;
		int x;
		int y;
		int z;
		int sum;

		System.out.print("500원의 개수를 입력하세요");
		w = input.nextInt();
		System.out.print("100원의 개수를 입력하세요");
		x = input.nextInt();
		System.out.print("50원의 개수를 입력하세요");
		y = input.nextInt();
		System.out.print("10원의 개수를 입력하세요");
		z = input.nextInt();

		sum = 500 * w + 100 * x + 50 * y + 10 * z;
		System.out.println(sum);
	}

}
