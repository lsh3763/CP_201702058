class Student {
	public String 이름;
	public int 학번;
	public String 학과;
	public int 학년;
	public int 이수학점;

	public String get이름() {
		return 이름;
	}

	public int get학번() {
		return 학번;
	}

	public String get학과() {
		return 학과;
	}

	public int get학년() {
		return 학년;
	}

	public int get이수학점() {
		return 이수학점;
	}

	public void set이름(String a) {
		이름 = a;
	}

	public void set학번(int b) {
		학번 = b;
	}

	public void set학과(String c) {
		학과 = c;
	}

	public void set학년(int d) {
		학년 = d;
	}

	public void set이수학점(int e) {
		이수학점 = e;
	}

	public void setStudent1() {
		이름 = "이수한";
		학번 = 201702058;
		학과 = "컴퓨터공학과";
		학년 = 1;
		이수학점 = 18;
	}

	public void setStudent2() {
		이름 = "조성훈";
		학번 = 201702074;
		학과 = "컴퓨터공학과";
		학년 = 1;
		이수학점 = 21;

	}

}

class UnderGraduate extends Student {
	public String 동아리명;

	public String get동아리명() {
		return 동아리명;
	}

	public void set동아리명(String f) {
		동아리명 = f;
	}

	public void setUnderGraduate() {
		동아리명 = "ADMIN";
	}

}

class Graduate extends Student {
	public String 조교유형;
	public double 장학금비율;

	public String get조교유형() {
		return 조교유형;
	}

	public double get장학금비율() {
		return 장학금비율;
	}

	public void set조교유형(String g) {
		조교유형 = g;
	}

	public void set장학금비율(double h) {
		장학금비율 = h;
	}

	public void setGraduate() {
		조교유형 = "교육 조교";
		장학금비율 = 0.4;
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
		System.out.println("학부생의 이름은: " + U.get이름());
		System.out.println("학부생의 학번은: " + U.get학번());
		System.out.println("학부생의 학과는: " + U.get학과());
		System.out.println("학부생의 학년은: " + U.get학년() + "학년");
		System.out.println("학부생의 이수 학점 수는: " + U.get이수학점() + "학점");
		System.out.println("학부생의 동아리 명은: " + U.get동아리명());
		System.out.println("대학원생의 이름은: " + G.get이름());
		System.out.println("대학원생의 학번은: " + G.get학번());
		System.out.println("대학원생의 학과는: " + G.get학과());
		System.out.println("대학원생의 학년은: " + G.get학년() + "학년");
		System.out.println("대학원생의 이수 학점 수는: " + G.get이수학점() + "학점");
		System.out.println("대학원생의 조교 유형은: " + G.get조교유형());
		System.out.println("대학원생의 장학금 비율은: " + G.get장학금비율() + "%");
	}

}
