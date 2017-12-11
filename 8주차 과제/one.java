import java.util.Scanner;

public class one {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		final int size = 10;
		int n, i, j, s;
		int[] seat = new int[size];
		for (s = 0; s < size; s++) {
			System.out.print("좌석을 예약하시겠습니까?(예:1,아니오:0):");
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
					System.out.print("몇번째 좌석을 예약하시겠습니까?");
					j = sc.nextInt();
					if (seat[j - 1] == 0) {
						seat[j - 1] = 1;
						System.out.println("예약되었습니다.");
					} else {
						System.out.println("이미 예약된 자리입니다.");
					}
					break;

				}
			default:
				break;

			}
		}
	}
}
