class plane {
	private String production;
	private String model;
	private int MaxPassenger;
	private static int planes;

	public String getproduction() {
		return production;
	}

	public void setproduction(String p) {
		production = p;
	}

	public String getmodel() {
		return model;
	}

	public void setmodel(String m) {
		model = m;
	}

	public int getMaxPassenger() {
		return MaxPassenger;
	}

	public void setMaxPassenger(int M) {
		MaxPassenger = M;
	}

	public plane() {
		production = "Pig SungHoon";
		model = "������";
		MaxPassenger = 80;
		planes++;
	}

	public plane(String p, String m, int M) {
		production = p;
		model = m;
		MaxPassenger = M;
		planes++;
	}

	public plane(String p, int M) {
		production = p;
		model = "������";
		MaxPassenger = M;
		planes++;
	}

	public static int getplanes() {
		return planes;
	}

}

public class two {
	public static void main(String args[]) {
		plane p1 = new plane("Dog SungHoon", "���̺����", 1);
		plane p2 = new plane();
		plane p3 = new plane("Rat SungHoon", 60);
		int k = plane.getplanes();
		System.out.println("������� ������ ������� ��: " + k);

	}

}
