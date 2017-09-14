/**
 * 
 */
package lib;

/**
 * @author shirin
 *
 */
public class AddressTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		testTheThreeParameteConstructor();
		testSetCivicNumber();
		testGetCode();
		Address myAddress = new Address("3040", "Sherbrooke", "montreal");

		//System.out.println(myAddress.getAddress());
	}
	private static void testTheThreeParameteConstructor() {
		System.out.println("Testing the three parameter constructor.");
		testTheThreeParameterConstructor("Case 1 - Valid data((3040 Sherbrooke Westmount)","3040",
				"Sherbrooke","Westmount",true);
		testTheThreeParameterConstructor("Case 2 - Invalid data– empty civicNumber ( Sherbrooke Westmount)"," ",
				"Sherbrooke","Westmount",false);
		testTheThreeParameterConstructor("Case 3 - Invalid data – all spaces civic number ( Sherbrooke Westmount)","    ",
				"Sherbrooke","Westmount",false);
		testTheThreeParameterConstructor("Case 4 - Invalid data – empty streetName ( 3040 Westmount)","3040",
			"","Westmount", false);
		testTheThreeParameterConstructor("Case 5 - Invalid data - all spaces streetName (3040       WestMount)", "3040",
				" 				" ,"Westmount", false);
		testTheThreeParameterConstructor("Case 6 -Invalid data - empty city (3040 Sherbrooke)", "3040","Sherbrooke",
				"", false);
		testTheThreeParameterConstructor("Case 7 -Invalid data - all spaces city (3040 Sherbrooke)","3040","Sherbrooke",
				"     ", false);
		testTheThreeParameterConstructor("Case 8 - Invalid data –null civicNumber (null Sherbrooke Westmount)", null,
				"Sherbrooke", "Westmount", false);
		testTheThreeParameterConstructor("Case 9 - Invalid data –null streetName (Sherbrooke , null Westmount)", "3040",
				"Sherbrooke", null, false);
		testTheThreeParameterConstructor("Case 10 - Invalid data –null city (null Sherbrooke Westmount)", "3040",
				null, "Westmount", false);
	}
		
		
		private static void testTheThreeParameterConstructor(String testCase,
				String civicNumber, String streetName, String city,
				boolean expectValid) {
			

			System.out.println("   " + testCase);

			try {
				Address theAddress = new Address(civicNumber, streetName, city);
				System.out.print("\tThe Address instance was created: " + theAddress);
				
				if (!expectValid)
					System.out.print("  Error! Expected Invalid. ==== FAILED TEST ====");
			}
			catch (IllegalArgumentException iae)	{
				System.out.print("\t"+ iae.getMessage());
				if (expectValid)
					System.out.print("  Error! Expected Valid. ==== FAILED TEST ====");
			}
			catch (Exception e) {
				System.out.print("\tUNEXPECTED EXCEPTION TYPE! " + e.getClass() +  " "  + 				e.getMessage() + " ==== FAILED TEST ====");
				if (expectValid)
					System.out.print(" Expected Valid.");
			}
	

			System.out.println("\n");
	}
		
		

	
	 	private static void testSetCivicNumber() {
	 		System.out.println("Test the setCivicNumber method.");
	 		testSetCivicNumber("Case 1 : Valid - 2086 without leading/trailing spaces",
	  				"2086","2086",true);
	  		testSetCivicNumber("Case 2: Invalid null civic number",
	  				null,"",false);
	 	testSetCivicNumber("Case 3: Invalid empty civic number",
	 			"","",false);
	 	testSetCivicNumber("Case 4: Invalid all spases civic number",
				"     ","",false);
	  	}
	  	
	  	private static void testSetCivicNumber(String testCase, 
	  			String civicNumber, String expectedCivicNumber,boolean expectValid){
	  		System.out.println("   " + testCase);
	
	  		try {
	 		Address theAddress = new Address (civicNumber, "Sherbrooke","Westmount");
	 		theAddress.setCivicNumber(civicNumber);
	  			System.out.print("\tThe Address instance was created: " + theAddress);
	  			
	 			if (!theAddress.getCivicNumber().equals(expectedCivicNumber))
	 				System.out.print("  Error! Expected Invalid. ==== FAILED TEST ====");
	 		}
	 		catch (IllegalArgumentException iae) {
	 			System.out.print("\t"+ iae.getMessage());
	 			if (expectValid)
	 				System.out.print("  Error! Expected Valid. ==== FAILED TEST ====");
	 		}
	 		catch (Exception e) {
	 			System.out.print("\tUNEXPECTED EXCEPTION TYPE! " + e.getClass() + " " +
	 					e.getMessage() + " ==== FAILED TEST ====");
	 			if (expectValid)
	 				System.out.print(" Expected Valid.");
	 		}
	 
	 		System.out.println("\n");
	 	}
	  	
	  	private static void testGetCode(String testCase, String code, String expectedCode) {
	  		
	  			System.out.println("   " + testCase);
	  			Address theAddress = new Address("3040", "Sherbrooke", "Westmount");
	  			System.out.println("\tThe Address instance was created: " + theAddress);
	  		 	if (!theAddress.getCode().equals(expectedCode)) {
	  				System.out.println("  Error! Expected Invalid. ==== FAILED TEST ====");
	  			}
	  		 	System.out.println("\n");
	  		 	}
	  		 
	  		 	private static void testGetCode() {
	  		 		System.out.println("Test the getCode method.");
	  		 		testGetCode("Case 1: Address  has a code", "h3v1","");
	  		 
	  		 	}

	}


