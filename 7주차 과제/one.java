class Dog {
	private String name;
	public static String breed;
	private int age;

	public Dog() {
		name = "�̼���";
		breed = "��";
		age = 20;
	}

	public Dog(String name, int age) {
		setDog(name, "��", age);
	}

	public Dog(String name, String breed, int age) {
		setDog(name, breed, age);
	}

	public void setDog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public void print() {
		System.out.println("�������� �̸�: " + name);
		System.out.println("�������� ����: " + breed);
		System.out.println("�������� ����: " + age);

	}

}

public class one {
	public static void main(String args[]) {
		Dog d1 = new Dog("������", 19);
		Dog d2 = new Dog("����", "��", 18);

		d1.print();
		d2.print();

	}

}
