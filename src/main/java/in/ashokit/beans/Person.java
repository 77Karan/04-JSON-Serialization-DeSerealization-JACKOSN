package in.ashokit.beans;

public class Person
{
	private int personId;
	private String personName;
	private int personAge;
	private Address address;
	public Person()
	{
		
	}
	public Person(int personId, String personName, int personAge, Address address) 
	{
		this.personId = personId;
		this.personName = personName;
		this.personAge = personAge;
		this.address = address;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String toString() 
	{
		return "Person [personId=" + personId + ", personName=" + personName + ", personAge=" + personAge + ", address="
				+ address + "]";
	}
	
	
	
	
	

}
