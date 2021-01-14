package Person;

public class Person {
	
	private String firstName;
	private String lastName;
	private Integer age;
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		if(age < 0 || age > 100) {
			this.age = 0;
		}
		this.age = age;
	}
	
	public boolean isTeen() {
		if(age > 12 && age < 20) {
			return true;
		}
		return false;
	}
	
	public String getFullName() {
		if(firstName == null && lastName == null) {
			return "";
		} else if(firstName == null) {
			return lastName;
		} else if(lastName == null) {
			return firstName;
		}
		return firstName + lastName;
	}
	
	public void lentg() {
		System.out.println(firstName.length());
	}
	
	

}
