
public class three {
	public static void main(String args[]) {

		double cm;
		int ft;
		double in;

		cm = 163;
		ft = (int) (cm / 2.54) / 12;
		in = (cm / 2.54) % 12;

		System.out.println("163cm는 피트" + ft);
		System.out.println("인치" + in);

	}

}
