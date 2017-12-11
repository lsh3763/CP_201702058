class Dog {
	private String name;
	public static String breed;
	private int age;

	public Dog() {
		name = "이수한";
		breed = "남";
		age = 20;
	}

	public Dog(String name, int age) {
		setDog(name, "남", age);
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
		System.out.println("강아지의 이름: " + name);
		System.out.println("강아지의 종류: " + breed);
		System.out.println("강아지의 나이: " + age);

	}

}

public class one {
	public static void main(String args[]) {
		Dog d1 = new Dog("조성훈", 19);
		Dog d2 = new Dog("고도현", "남", 18);

		d1.print();
		d2.print();

	}

}
