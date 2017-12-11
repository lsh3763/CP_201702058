public class three {
	public static void main(String args[]) {
		int i;
		int j;

		for (i = 0; i < 5; i++) {
			for (j = i; j < 5; j++) {
				System.out.print(" ");
			}
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			for (j = 0; j < i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 0; i < 5; i++) {
			for (j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (j = i; j < 5; j++) {
				System.out.print("*");
			}
			for (j = i + 1; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
