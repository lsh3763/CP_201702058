class Student {
	public String �̸�;
	public int �й�;
	public String �а�;
	public int �г�;
	public int �̼�����;

	public String get�̸�() {
		return �̸�;
	}

	public int get�й�() {
		return �й�;
	}

	public String get�а�() {
		return �а�;
	}

	public int get�г�() {
		return �г�;
	}

	public int get�̼�����() {
		return �̼�����;
	}

	public void set�̸�(String a) {
		�̸� = a;
	}

	public void set�й�(int b) {
		�й� = b;
	}

	public void set�а�(String c) {
		�а� = c;
	}

	public void set�г�(int d) {
		�г� = d;
	}

	public void set�̼�����(int e) {
		�̼����� = e;
	}

	public void setStudent1() {
		�̸� = "�̼���";
		�й� = 201702058;
		�а� = "��ǻ�Ͱ��а�";
		�г� = 1;
		�̼����� = 18;
	}

	public void setStudent2() {
		�̸� = "������";
		�й� = 201702074;
		�а� = "��ǻ�Ͱ��а�";
		�г� = 1;
		�̼����� = 21;

	}

}

class UnderGraduate extends Student {
	public String ���Ƹ���;

	public String get���Ƹ���() {
		return ���Ƹ���;
	}

	public void set���Ƹ���(String f) {
		���Ƹ��� = f;
	}

	public void setUnderGraduate() {
		���Ƹ��� = "ADMIN";
	}

}

class Graduate extends Student {
	public String ��������;
	public double ���бݺ���;

	public String get��������() {
		return ��������;
	}

	public double get���бݺ���() {
		return ���бݺ���;
	}

	public void set��������(String g) {
		�������� = g;
	}

	public void set���бݺ���(double h) {
		���бݺ��� = h;
	}

	public void setGraduate() {
		�������� = "���� ����";
		���бݺ��� = 0.4;
	}
}

public class two {
	public static void main(String args[]) {
		UnderGraduate U = new UnderGraduate();
		Graduate G = new Graduate();
		U.setStudent1();
		U.setUnderGraduate();
		G.setStudent2();
		G.setGraduate();
		System.out.println("�кλ��� �̸���: " + U.get�̸�());
		System.out.println("�кλ��� �й���: " + U.get�й�());
		System.out.println("�кλ��� �а���: " + U.get�а�());
		System.out.println("�кλ��� �г���: " + U.get�г�() + "�г�");
		System.out.println("�кλ��� �̼� ���� ����: " + U.get�̼�����() + "����");
		System.out.println("�кλ��� ���Ƹ� ����: " + U.get���Ƹ���());
		System.out.println("���п����� �̸���: " + G.get�̸�());
		System.out.println("���п����� �й���: " + G.get�й�());
		System.out.println("���п����� �а���: " + G.get�а�());
		System.out.println("���п����� �г���: " + G.get�г�() + "�г�");
		System.out.println("���п����� �̼� ���� ����: " + G.get�̼�����() + "����");
		System.out.println("���п����� ���� ������: " + G.get��������());
		System.out.println("���п����� ���б� ������: " + G.get���бݺ���() + "%");
	}

}
