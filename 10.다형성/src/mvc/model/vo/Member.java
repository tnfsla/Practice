package mvc.model.vo;

public class Member {
	private String name;
	private int age;
	private char gender;
	private int couponCount=0;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String name, int age, char gender, int couponCount) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.couponCount = couponCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getCouponCount() {
		return couponCount;
	}

	public void setCouponCount(int couponCount) {
		this.couponCount = couponCount;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name +" / "+age+" / "+gender+" / "+couponCount;
	}
	
	

}
