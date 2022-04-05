package objectorinetedprogramming.assignment1; // This lines says that I am writing my code in the package called object...etc

/**
	A Customer class represent the specification for the customer object. 
	A Customer has certain attributes such as name, familyName, age. He also has a certain amount of cash with him
	and a creditCard. Both of these can be used to pay for the ticket to the cinema. A customer can book a ticket
	for a movie and can also talk to the employee. 
	
  	@author Jozef Yika
 */

public class Customer {
	
	
	//FIELDS
	/**
		Instance Variable 'moneyWallet' represents the amount of money in cash and creditCard represents the amount of money
		that the customer has in the bank. 
	 */
	private String name;
	private String familyName;
	private double moneyWallet;
	private double creditCard;
	private int age;
	
	
	
	//CONSTRUCTORS 		
	/**
		The default constructor sets the following values: cash = 50, crediCard = 5000, age = 23
	  	These values will be called in the main method when using this default constructor to build
	  	the customer object.
	 */
	public Customer()
	{
		this("Jozef","Yika",50,5000,23); 
	}
	
	/**
	 * Custom constructor accepts 4 parameters which when passed in the main method assign values to all the
	   attributes.
	   @param name is the name of a customer
	   @param familyName is the family name of the customer
	   @param moneyWallet is the amount of money in cash in pounds 
	   @param creditCard  is the amount of money in the bank also in pounds
	   @param age is the age of a customer
	 */
	public Customer(String name, String familyName, double moneyWallet, double creditCard,int age)
	{
		this.name = name;
		this.familyName = familyName;
		this.moneyWallet = moneyWallet;
		this.creditCard = creditCard;
		this.age = age;
		
	}
	
	
	//METHODS
	/**
	   Below I am defining getters and setters. Setters start with the word 'set' and getters with the word 'get'.
	   Setters assign the passed value to attributes and getters return the value which was assigned. Since I 
	   explained what they do I am going to comment on just a couple. 
	  
	   The first setter 'setName' sets the name of the customer ( if we pass e.g'jozef' as a parameter it will assign
	   'jozef' to the instance variable name and this will be the name of the current customer. 
	   
	   @param name is the name of the customer
	 */
	public void setName(String name){
		
		this.name = name;
	}
	
	/**
	   Returns the name of the customer ( if we set the name to 'jozef' this method will return string 'jozef'.
	   If we create a 'customer' object in the main method. We can print out this string using System.out.println(customer.getName()); 
	  
	   @return the name of the customer
	 */
	public String getName() {
		
		return name;
	}
	
	/**
	 * Sets the family name
	 * @param familyName is the family name of the customer
	 */
	public void setFamilyName(String familyName) {
		
		this.familyName = familyName;
	}
	
	/**
	 * @return family name of the customer
	 */
	public String getFamilyName() {
		
		return familyName;
	}
	
	/**
	 * Sets the amount of money in cash 
	 * @param moneyWallet refers to how much money in cash the customer has
	 */
	public void setMoneyWallet(double moneyWallet) {
		
		this.moneyWallet= moneyWallet;
	}
	/**
	 * @return the amount of money in cash - returns the current value of moneyWallet variable 
	 */
	public double getMoneyWallet() {
		
		return moneyWallet;
	}
	
	/**
	 * Sets the amount of money on the credit card
	 * @param creditCard refers to how much money the customer has in the bank 
	 */
	public void setCreditCard(double creditCard) {
		
		this.creditCard = creditCard;
	}
	
	/**
	 * Returns the amount of money on the credit card
	 * @return the value of creditCard variable 
	 */
	public double getCreditCard() {
		
		return creditCard;
	}
	/**
	 * Sets the age of the customer 
	 * @param age of the customer 
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * Returns the age of the customer 
	 * @return the current value of age variable 
	 */
	public int getAge() {
		
		return age;
	}
	
	
	
	
	
	
	/**
	   Method 'booktMovie' accepts 4 parameters as shown below. In the body of this method I invoked 
	   'interactWithCustomer' ( which belongs to an Employee class ) on one of the parameters that 'bookMovie' 
	   accepts. In this case I invoked it on the employee variable. The employee object is created in the main method
	   and is passed in to the 'bookMovie' method, meaning all of employee's data such as name, etc is passed here. 
	  
	   @param movie is of data type class 'Movie' and refers to the movie that the customer wants to book a ticket for
	   @param employee is of of data type class 'Employee' and refers to the employee who is helping the customer
	  
	   @param pay is of data type boolean. This checks wether the customer wants to book a ticket or not. This 
	   will be set to either true or false when 'bookMovie'  method is invoked in the main method.
	   
	   @param child is of data type class 'ChildCustomer' and refers to a customer who is a child. 
	 */
	public void bookMovie(Movie movie, Employee employee, boolean pay, ChildCustomer child) {
		
		
		/*
		   comments in the main method....... please see them first and then come back here
		  
		   Then to the 'interactWithCustomer' method I am passing the following:
			   1. this - which holds a reference to the current customer object
			   2. movie - which holds a reference to the current movie object
			   3. pay - which is either true/false ( this is set in the main method)
			   4. child - which holds  a reference to the current child object
			   
			If you go now to the Employee class and look for the interactWithCustomer method you will be
			able to see what's going on inside of it's body.
		  
		 */
		
		employee.interactWithCustomer(this, movie, pay, child);
	}
	
	
	
	
	
	/**
	  Method 'conversateWtihEmployee' accepts 2 parameters as shown below. As the name indicates this method is used 
	  so that the customer is able to talk with the employee. It will be invoked in the main method on the customer
	  object.  In the body of this method I am checking whether the customer is old enough to watch the movie and 
	  printing out the appropriate responses.  
	  
	 * @param employee is an employee that is helping the customer 
	 * @param movie is the movie that the customer chooses. 
	 */
	public void conversateWithEmployee(Employee employee, Movie movie) {
		
		
		if (getAge() < movie.getRating()){
			
			System.out.println("Oh ! Really. Well, there is nothing I can do. Thank your help. Bye ");
		}
		else if (getAge() >= movie.getRating()) {
			
			System.out.println("Great.Thank you for your help " + employee + "\n");
		}
		
	}
	
	

	/**
	 * I am overriding the toString method which by default resides in the Object Class. I am doing that so that
	   I can print out the customer's data just like shown below in the body of this method. 
	 */
	@Override
	public String toString() {
		return "[name=" + name + ", familyName=" + familyName + ", moneyWallet=" + moneyWallet
				+ ", creditCard=" + creditCard + "]";
	}
	
	
	
	
	
	
	
}
