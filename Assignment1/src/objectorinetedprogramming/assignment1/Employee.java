package objectorinetedprogramming.assignment1; 
/**
 	Employee class represents the specification for the employee object. Employee has certain attributes such as
 	name and position. Employee can help the customer with booking a ticket and he can also process payments from the 
 	customer. 
 	
 	@author Jozef Yika
 */
public class Employee {
	
	//FIELDS
	
	/**
	  Instance variable name refers to the name of the customer. 
	  Instance variable postiion refers to the position of the employee (i.e receptionist, assistant , manager etc)
	 */
	private String name; 
	private String position;
	
	
	
	//CONSTRUCTOR
	
	/**
	  Default constructor sets the name and position to values shown below. This keyword points to the current Object.
	  
	 */
	public Employee() 
	{
		
		this("Aleksander","Receptionist");
	}
	
	
	/**
	 	Custom constructor accepts two parameters and assigns their values to the fields/attributes. The values will 
	 	be passed in the main method when the employee object is created or when the on of the setter methods are invoked. 
	  
	 * @param name Name of the employee 
	 * @param position Position of the employee 
	 */
	public Employee(String name, String position)
	{
		this.name = name;
		this.position = position;
		
	}
	
	//METHODS
	/**
	 	Sets the name of the employee. Whatever string value we will be passing in the main method when the setName 
	 	is invoked , this value will be assigned to the attribute 'name'. 
	 	
	 * @param name is the name of the employee
	 */
	public void setName(String name) {
		
		this.name = name;
	}
	
	
	/**
	   Returns the name of the employee. 
	   Returns the value that is being stored in attribute name. 
	   
	 * @return the name of the employee. 
	 */
	public String getName() {
		
		return name;
	}
	
	/**
	 * Sets the position of he employee
	 * @param position is stored in the  position variable 
	 */
	public void setPosition(String position) {
		
		this.position = position;
	}
	/**
	 * Returns the position fo the customer as a string (i.e assistant etc. )
	 * @return the current value of the variable position 
	 */
	public String getPostion() {
		
		return position;
	}
	
	
	
	/**
	 	Method 'interactWithCustomer' accepts 4 parameters as shown below. In the body of this method I am checking 
	 	for the following: 
	 	1. Does the customer want to book a movie? 2. Does he/she have enough cash/money on the credit card to book
	 	a ticket? 3. Is the customer old enough to watch a movie? 4. What's the price of the ticket if the customer
	 	is a child? 
	 
	 * @param customer is a customer that is helping the customer
	 * @param movie is a movie that the customer has chosen
	 * 
	 * @param pay  checks whether the customer decided to book a ticket or not. This is set to either true or false
	 * in the main when this method is invoked. 
	 * 
	 * @param child is a customer who is a child 
	 */
	public void interactWithCustomer(Customer customer, Movie movie, boolean pay, ChildCustomer child) {
		
		if (pay == true || customer.getAge() > movie.getRating()) {
			if (movie.getPrice() <= customer.getMoneyWallet()) {

				
				processPayment(customer, movie); // process payment for the customer with the movie that he/she has chosen
												 

			} else if (movie.getPrice() <= customer.getCreditCard()) {

				System.out.println("Proceed card payment.... ");
				processPayment(customer, movie);
			} else if (movie.getPrice() > customer.getMoneyWallet()) {

				System.out.println("Unfortunately you don't have enough money for this movie");

			}

			else if (movie.getPrice() > customer.getCreditCard()) {

				System.out.println(
						"Proceed card payment... I am sorry but you don't have enough money on your credit card");
			}

		} else if (pay == true || customer.getAge() < movie.getRating()) {
			System.out.println("I am sorry you are not old enough to watch this movie");
		} else if (child.getAge() <= movie.getRating() && movie.getPrice() <= child.getMoneyWallet()) {

			double childPrice = movie.getPrice() / 2; // divide the price of the movie by half 
			System.out.println("Since you are a child you are eligible for the 50% discount. " + "You paid "
					+ childPrice + "£" + "\n");

			System.out.println("You have succesfully booked a ticket for " + movie);
			System.out.println("The payment of " + childPrice + "£" + " has been accepted");

		}
		
	}
	
	/**
	 	Method 'processPayment' accepts two arguments as shown below. In the body of this method I print out 
	 	messages that the customer has book a ticket for movie and the details of that movie. This method is
	 	invoked in the 'interactWithCustomer' method only when all of the criteria for the customer to watch a 
	 	movie has been met. 
	 	
	 * @param customer is a customer that the employee is helping 
	 * @param movie is a movie that customer has chosen
	 */
	public void processPayment(Customer customer, Movie movie) {
		
		System.out.println("You have succesfully booked a ticket for " + movie.toString());
		System.out.println("The payment of " + movie.getPrice() + "£" + " has been accepted" + "\n");
		
		
	}
	
	/**
	 	This just returns the name. I didn't really have a need of overriding toString method in more details. 
	 
	 */
	public String toString() {
		
		return name;
	}
	
	

}
