
class Employee {
	private String �̸�;
	private String ��ȭ��ȣ;
	private int ����;

	public String get�̸�() {
		return �̸�;
	}

	public void set�̸�(String x) {
		�̸� = x;
	}

	public String get��ȭ��ȣ() {
		return ��ȭ��ȣ;
	}

	public void set��ȭ��ȣ(String y) {
		��ȭ��ȣ = y;
	}

	public int get����() {
		return ����;
	}

	public void set����(int z) {
		���� = z;
	}
}

public class two {
	public static void main(String args[]) {
		Employee myEmployee = new Employee();

		myEmployee.set�̸�("������");
		myEmployee.set��ȭ��ȣ("010 4125 7467");
		myEmployee.set����(1000000);

		System.out.println("������� �̸���: " + myEmployee.get�̸�());
		System.out.println("������� ��ȭ��ȣ��: " + myEmployee.get��ȭ��ȣ());
		System.out.println("������� ������: " + myEmployee.get����());

	}

}
