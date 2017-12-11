
class Box {
	private int 가로;
	private int 세로;
	private int 높이;
	private int Volume;

	public int get가로() {
		return 가로;
	}

	public void set가로(int x) {
		가로 = x;
	}

	public int get세로() {
		return 세로;
	}

	public void set세로(int y) {
		세로 = y;
	}

	public int get높이() {

		return 높이;
	}

	public void set높이(int z) {
		높이 = z;
	}

	public int getVolume() {
		return Volume = 가로 * 세로 * 높이;
	}
	public void print() {
		System.out.println("가로의길이: " + get가로());
		System.out.println("세로의길이: " + get세로());
		System.out.println("높이의길이: " + get높이());
		System.out.println("상자의 부피: " + getVolume());
	}
	
	
}

public class one {
	
	public static void main(String args[]) {
		Box myBox = new Box();

		myBox.set가로(10);
		myBox.set세로(20);
		myBox.set높이(50);
		myBox.print();
		myBox.getVolume();

}
}


