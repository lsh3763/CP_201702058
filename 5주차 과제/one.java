
class Box {
	private int ����;
	private int ����;
	private int ����;
	private int Volume;

	public int get����() {
		return ����;
	}

	public void set����(int x) {
		���� = x;
	}

	public int get����() {
		return ����;
	}

	public void set����(int y) {
		���� = y;
	}

	public int get����() {

		return ����;
	}

	public void set����(int z) {
		���� = z;
	}

	public int getVolume() {
		return Volume = ���� * ���� * ����;
	}
	public void print() {
		System.out.println("�����Ǳ���: " + get����());
		System.out.println("�����Ǳ���: " + get����());
		System.out.println("�����Ǳ���: " + get����());
		System.out.println("������ ����: " + getVolume());
	}
	
	
}

public class one {
	
	public static void main(String args[]) {
		Box myBox = new Box();

		myBox.set����(10);
		myBox.set����(20);
		myBox.set����(50);
		myBox.print();
		myBox.getVolume();

}
}


