/**
 *  Defines an Address type.
 */

package lib;

/**
 * @author Shirin
 */

public class Address {
    private String civicNumber="";
    private String streetName="";
    private String province ="";
    private String code ="";
    private String city = "";

    	
    public Address() { }

    public Address(String civicNumber, String streetName, String city) {
		this.civicNumber = validateExistence("civic number", civicNumber);
		this.streetName = validateExistence("street name", streetName);
		this.city = validateExistence("city", city);
	}

    public String getAddress() {
		String address = civicNumber + " " + streetName + "\n" + city;
		address += (province.equals("")?"": (", " + province)) +
			 (code.equals("")?"":("\n" + code));

		return address;
	}
    @Override
    public String toString() {
    	return (civicNumber + "*" +	streetName + "*" +
    			city + "*" +province + "*" +	code);
    }



    /**
	 * @param civicNumber the civicNumber to set
	 */
	public void setCivicNumber(String civicNumber) {
		this.civicNumber = civicNumber;
	}

	/**
	 * @param streetName the streetName to set
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getCivicNumber()  {
    	return civicNumber;
    }
    
    public String getStreetName()    {
    	return streetName;
    }
    public String getCity() {
    	return city;
    	
    }
    public String getProvince() {
    	return province;
    	
    }
    public String getCode() {
    	return code;
    	
    }
    private String validateExistence(String fieldName, String fieldValue) {
    	 if (fieldValue == null)
    			throw new IllegalArgumentException("Address Error - " + fieldName
    				+ " must exist. Invalid value = " + fieldValue);

		String trimmedString = fieldValue.trim();
		if (trimmedString.isEmpty())
			throw new IllegalArgumentException("Address Error - " + fieldName
					+ " must exist. Invalid value = " + fieldValue);
		return trimmedString;
	}


}
