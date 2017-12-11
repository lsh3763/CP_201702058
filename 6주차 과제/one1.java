
import java.util.Scanner;

public class one1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.print("문자를 입력하세요: ");
		str = sc.nextLine();

		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);

	}
}
