
import java.util.Scanner;

public class two {
	public static void main(String args[]) {
		double Ű;
		double ������;
		double ǥ��ü��;
		double A, B;
		Scanner input = new Scanner(System.in);
		System.out.print("Ű: ");
		Ű = input.nextDouble();
		ǥ��ü�� = (Ű - 100) * 0.9;
		System.out.println(ǥ��ü��);
		System.out.print("������: ");
		������ = input.nextDouble();
		A = ǥ��ü�� + ǥ��ü�� * 0.1;
		B = ǥ��ü�� - ǥ��ü�� * 0.1;

		if (������ >= B & ������ <= A) {
			System.out.println("����ü�� �Դϴ�.");
		}

		else if (������ < B) {
			System.out.println("��ü�� �Դϴ�.");
		} else if (������ > A) {
			System.out.println("��ü���Դϴ�.");
		}

	}

}
