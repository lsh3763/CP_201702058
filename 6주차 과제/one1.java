
import java.util.Scanner;

public class one1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.print("���ڸ� �Է��ϼ���: ");
		str = sc.nextLine();

		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);

	}
}
