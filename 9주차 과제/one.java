class Person {
	public String name;
	public String address;
	public String phone;

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public void setName(String n) {
		name = n;
	}

	public void setAddress(String a) {
		address = a;
	}

	public void setPhone(String p) {
		phone = p;
	}

	public void setPerson() {
		name = "조성훈";
		address = "대전";
		phone = "010 4125 7467";
	}
}

class Customer extends Person {
	public String number;
	public int mileage;

	public String getNumber() {
		return number;
	}

	public int getMileage() {
		return mileage;
	}

	public void setNumber(String n) {
		number = n;
	}

	public void setMileage(int m) {
		mileage = m;
	}

	public void setCustomer() {
		number = "34번";
		mileage = 500;
	}
}

public class one {
	public static void main(String args[]) {
		Customer c = new Customer();
		c.setPerson();
		c.setCustomer();
		System.out.println("이름은: " + c.getName());
		System.out.println("주소는: " + c.getAddress());
		System.out.println("전화번호는: " + c.getPhone());
		System.out.println("고객번호는: " + c.getNumber());
		System.out.println("마일리지 점수는: " + c.getMileage() + "점");
	}

}
