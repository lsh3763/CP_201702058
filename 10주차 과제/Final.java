import java.util.Scanner;

class Shape {

	int width, height;

	Shape(int width, int height) {
		this.width = width;
		this.height = height;

	}

	int area() {
		return 0;

	}

}

class Triangle extends Shape {
	Triangle(int width, int height) {
		super(width, height);
		this.width = width;
		this.height = height;
	}

	int area() {
		return width * height * 1 / 2;

	}

}

class Rectangle extends Shape {
	Rectangle(int width, int height) {
		super(width, height);
		this.width = width;
		this.height = height;
	}

	int area() {
		return width * height;
	}

}

class Circle extends Shape {
	Circle(int width, int height) {
		super(width, height);
		this.width = width;
		this.height = height;
	}

	int area() {
		return (int) (3.14 * width * width); // width�� ���� �������̶�� ����

	}

}

public class Final {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���̸� �Է��ϼ���. ");
		int width = sc.nextInt();
		System.out.print("������ ���̸� �Է��ϼ���. ");
		int height = sc.nextInt();
		Triangle t = new Triangle(width, height);
		Rectangle r = new Rectangle(width, height);
		Circle c = new Circle(width, height);

		Shape[] shape = new Shape[3];
		shape[0] = t;
		shape[1] = r;
		shape[2] = c;
		for (int i = 0; i < shape.length; i++) {
			System.out.println("�����ǳ��̴�: " + shape[i].area());
		}

	}
}
