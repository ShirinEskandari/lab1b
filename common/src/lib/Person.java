/**
 * 
 */
package lib;

/**
 * @author shirin
 *
 */
public class Person {
	
	private Name name;
	private Address address;
	
	
	public Person (String firstName, String lastName) {
		
		this.name = new Name(firstName, lastName);
		this.address= new Address();
	}
	
	public Person (String firstName, String lastName, Address address) {
		
		this.name= new Name(firstName, lastName);
		this.address = new Address(address.getCivicNumber(), address.getStreetName(), address.getCity());
		
	}
	
	public Name getName() {
		Name nameNew= new Name (this.name.getFirstName(), this.name.getLastName());
		return nameNew;
		
	}
	
	public Address getAddress() {
		
		if (this.address.getCivicNumber().isEmpty()) {
			return null;
		}
		else {
			Address addressNew = new Address(this.address.getCivicNumber(), this.address.getStreetName(), this.address.getCity());
			
			return addressNew;
		}
	}
			
			
		
	public void setName(String firstName, String lastName) {
		 		this.name.setFirstName(firstName);
		 		this.name.setLastName(lastName);
		 	}
		 	
		 	public void setAddress(Address address) {
		 		this.address.setCivicNumber(address.getCivicNumber());
		 		this.address.setStreetName(address.getStreetName());
		 		this.address.setCity(address.getCity());
		 	}
		 	
		 	@Override
		 	public String toString() {
		 
		 			return name.toString() + "*" + 
		 					(address == null ? ""  : 
		 						address.toString());

}
}
