import java.util.Scanner;

public class one {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		final int size = 10;
		int n, i, j, s;
		int[] seat = new int[size];
		for (s = 0; s < size; s++) {
			System.out.print("�¼��� �����Ͻðڽ��ϱ�?(��:1,�ƴϿ�:0):");
			n = sc.nextInt();
			switch (n) {
			case 1:
				while (true) {
					System.out.println("--------------------------");
					for (i = 0; i < size; i++)
						System.out.print(i + 1 + " ");
					System.out.println("\n--------------------------");
					for (i = 0; i < size; i++)
						System.out.print(seat[i] + " ");
					System.out.println("\n--------------------------");
					System.out.print("���° �¼��� �����Ͻðڽ��ϱ�?");
					j = sc.nextInt();
					if (seat[j - 1] == 0) {
						seat[j - 1] = 1;
						System.out.println("����Ǿ����ϴ�.");
					} else {
						System.out.println("�̹� ����� �ڸ��Դϴ�.");
					}
					break;

				}
			default:
				break;

			}
		}
	}
}
