package objectorinetedprogramming.assignment1;



/**
  ChildCustomer class is a child class of Customer class. This is why I use the key word 'extends' next to it.
  This class inherits the behaviour from the Customer class. 
 
 * @author Jozef Yika
 *
 */
public class ChildCustomer extends Customer{
	
	
	
	
	
	/**
	   The child's class constructor should be build the same way as the parent constructor. In the body of
	   this constructor I invoke parent's custom constructor by using super keyword. Super points to the 
	   parent's constructor.
	  
	 * @param name is the name of the customer 
	 * @param familyName is the familyName of the customer 
	 * @param moneyWallet is the cash that the customer has
	 * @param creditCard is the amount of money in the bank that the customer has
	 * @param age is the age of the customer 
	 */
	public ChildCustomer(String name, String familyName, double moneyWallet, double creditCard,int age){
		
		super(name,familyName,moneyWallet,creditCard, age);
		
	}
	
	
	
	
	
	

}
