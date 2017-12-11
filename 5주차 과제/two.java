
class Employee {
	private String 이름;
	private String 전화번호;
	private int 연봉;

	public String get이름() {
		return 이름;
	}

	public void set이름(String x) {
		이름 = x;
	}

	public String get전화번호() {
		return 전화번호;
	}

	public void set전화번호(String y) {
		전화번호 = y;
	}

	public int get연봉() {
		return 연봉;
	}

	public void set연봉(int z) {
		연봉 = z;
	}
}

public class two {
	public static void main(String args[]) {
		Employee myEmployee = new Employee();

		myEmployee.set이름("조성훈");
		myEmployee.set전화번호("010 4125 7467");
		myEmployee.set연봉(1000000);

		System.out.println("고용인의 이름은: " + myEmployee.get이름());
		System.out.println("고용인의 전화번호는: " + myEmployee.get전화번호());
		System.out.println("고용인의 연봉은: " + myEmployee.get연봉());

	}

}
