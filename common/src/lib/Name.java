/**
 * 
 */
package lib;

/**
 * @author shirin
 *
 */
public class Name {
	
	private String lastName;
	private String firstName;
	
	public Name(String firstName,String lastName) {
		
		this.firstName = firstName;
		this.lastName =  lastName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFullName() {
		
		return this.firstName + "  " +this.lastName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Name [lastName=" + lastName + ", firstName=" + firstName + "]";
	}
	

}
