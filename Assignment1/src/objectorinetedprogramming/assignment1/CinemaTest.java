package objectorinetedprogramming.assignment1;  // This says that we are working in the package called object...etc.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



/**
 * Project chosen for this assignment is: Cinema Booking (80)
   
   A cinema booking can be for a number of adults and children. 
   The child’s ticket price is half of the adult. The cost of the booking can be retrieved. 
   
   I am importing: File, FileNotFoundException, ArrayList, Scanner classes because I am using all these
   in the main method. 
   
   
   
 * @author Jozef Yika
 *
 */
public class CinemaTest {

	/**
	 * IMPORTANT: The code is presented using Scenarios which describe different situation that may happen 
	   during the process of booking the ticket for a movie in the cinema. As you will be able to see
	   scenarios start from SCENARIO 1.  
	   
	   SCENARIO 1 - 3 are detailed situations with conversation between the customer and the employee.
	   SCENARIO 4 and 5 are less detailed situations that were made for testing specific methods to see
	   if these work properly. 
	   SCENARIO 6 is a scenario were the customer is a child who has 50% discount on a ticket. This 
	   scenario presents the use of ArrayList, User Input, Reading from the file and various Conditionals.
	   
	   IMPORTANT: When you run the code, please scroll all the way up in the console and start from there :)
	   The code won't be terminated because the last scenario has a user input , but I would suggest scrolling up
	   and read from the top line by line.  
	   Each scenario is separated by a line made of dashes so if you want to start from the last scenario and type
	   answers into the console you can scroll up to the first encountered line. If you are working on a big screen 
	   you probably don't need to scroll up as you see more of the console.  
	 * 
	 * @param args is  a variable of data type String Array
	 * @throws FileNotFoundException if the file is not found catch that error. 
	 */
	public static void main(String[] args) throws FileNotFoundException {
			
			
		
		
			/**SCENARIO 1: Using default constructors, customer has enough money to pay, and is old enough to watch the movie*/ 
			
			Customer cust1 = new Customer ();			
			System.out.println("Hello, how are you doing? My name is " + cust1.getName() + " " + cust1.getFamilyName() + "\n");
		
			Employee employee = new Employee();
			System.out.println("Hello! Welcome to our cinema. My name is " + employee.getName()  + " and I work here as a " + employee.getPostion());
			System.out.println("How can I help you? " + "\n");
			
			Movie movie = new Movie();
			System.out.println("I would like to book a ticket for " + movie.getTitle() + "\n");
			
			ChildCustomer child = new ChildCustomer("Alicia", "Carmen", 10.0, 20.0, 10);
			
			movie.setRating(18);
			System.out.println("Sure no problem. How old are you?" );
			
			
			System.out.println("I am " + cust1.getAge() + "\n");
			
			/* I am invoking the bookMovie on the cust1 Object and I am passing 4 parameters:
			   1.movie -  which holds a reference to the movie object 
			   2. employee - which holds a reference to the employee object
			   3. true - which is a boolean expression ( means that the customer wants to pay for the ticket)
			   4. child - which holds  a reference to the child object
			   
			   If you go to the customer class you will be able to see that 'bookMovie' accepts these
			   parameters and in the body of 'bookMovie' I invoke another method called 'interactWithCustomer'
			   which is invoked on the employee parameter which NOW holds a reference to the employee object
			   created here in the main method above.  
			   
			   You can now go to the customer class and look for bookMovie method to read further comments. 
			 */
			System.out.println("Ok you are old enough");
			cust1.bookMovie(movie, employee, true, child);  
			cust1.conversateWithEmployee(employee,movie); 
			
			
			System.out.println("--------------------------------------------------------------------------");
			
			
			/**SCENARIO 2: Using custom constructors and the customer doesn't have enough money and isn't old enough to watch the movie*/ 
		    
			Customer cust2 = new Customer ("Daria","Provencano",15.0, 10.0, 17);			
			System.out.println("\n" + "Hello, how are you doing? My name is " + cust2.getName() + " " + cust2.getFamilyName() + "\n");
		
			Employee employee2 = new Employee("Julius","Assitant Receptionist");
			System.out.println("Hello! Welcome to our cinema. My name is " + employee2.getName()  + " and I work here as a " + employee2.getPostion());
			System.out.println("How can I help you? " + "\n");
			
			Movie movie2 = new Movie("Castle in the sky", 50.0, "Monday, 10:00");
			System.out.println("I would like to book a ticket for " + movie2.getTitle() + "\n");
			
			movie2.setRating(18);
			System.out.println("Sure no problem. How old are you?" );
			
			System.out.println("I am " + cust2.getAge() + "\n");
			
			cust2.bookMovie(movie2, employee2, false,child);
			cust2.conversateWithEmployee(employee2,movie2);
			
				
			System.out.println("--------------------------------------------------------------------------");
			
			
			/** SCENARIO 4 & 5: Below I am changing the values using  setters ( for the sake of visibility 
			  I am not showing the entire conversation between the customer and employee ) The code below is
			  just to test whether some of the scenarios which were not yet shown are working properly.
			  For the purpose of visibility I am reducing the amount of conversation between the employee and child customer.
			**/
			
			/**SCENARIO 4: Customer (cust1 Object) is old enough to watch a movie , but doesn't have enough money in the wallet and in the bank account*/
			  
			System.out.println("TESTING SCENARIO 4: Customer is old enough to watch a movie, but doesn't have enough money" + "\n");
			movie.setTitle("Civil War");
			movie.setPrice(50.0);
			movie.setRating(18);
			
			cust1.setAge(20);
			cust1.setMoneyWallet(10.0);
			cust1.setCreditCard(10.0);
			
			
			
			cust1.bookMovie(movie, employee, false, child);
			cust1.conversateWithEmployee(employee, movie);
			
			
			/**SCENARIO 5: The Customer is old enough to watch a movie , doesn't have cash but has savings in the bank*/
			
			System.out.println( "\n" + "TESTING SCENARIO 5: Customer is old enough to watch a movie, doesn't have cash but has savings in the bank" + "\n");
			movie.setTitle("Civil War");
			movie.setPrice(50.0);
			movie.setRating(18);
			
			cust1.setAge(20);
			cust1.setMoneyWallet(10.0);
			cust1.setCreditCard(100.0);
			
			
			
			cust1.bookMovie(movie, employee, false, child);
			cust1.conversateWithEmployee(employee, movie);
			
			
			
			System.out.println("--------------------------------------------------------------------------");
			
			
			/**SCENARIO 6: Using custom constructors and the customer now is a child. 
			   : The child has enough money and the ticket has a 50 % discount
		  	   : Child instance of a class already created in the SCENARIO 1 above so I could use this instance
			   : For the sake of visibility I used another instance with changed values          
			**/
			ChildCustomer childA = new ChildCustomer("Alicia", "Carmen", 9.0, 20.0, 9);
			
			
				
			System.out.println("\n" + "Hello? My name is " + childA.getName() + " " + childA.getFamilyName() + "\n");
			
			Employee employee3 = new Employee("Mark","Assitant Receptionist");
			System.out.println("Hello! Welcome to our cinema. My name is " + employee3.getName()  + " and I work here as a " + employee3.getPostion());
			System.out.println("How can I help you? " + "\n");
			
			Movie movie3 = new Movie("Cinderella",20.0, "Tuesday 18:00");
			
			movie3.setRating(10);
			childA.setAge(10);
			childA.setMoneyWallet(20.0);
			
			
			
			System.out.println("I would like to book a ticket for a movie");
			
			ArrayList<String> movieList = new ArrayList<String>(); // creating an array list for the list of the movies 
			movieList.add("Batman");
			movieList.add("Castle");
			movieList.add("Cinderella");
			movieList.add("Barbie");
			
			System.out.println("This is our movie list: " + movieList + " and since you are a child you are only eligible for the last two");
			
			String thirdMovie = movieList.get(2);  // extracting specific movies from the list 
			String fourthMovie = movieList.get(3);

			Scanner input = new Scanner(System.in); // creating a scanner object which will be used to take user input
												

			System.out.println("\n" + "Choose between those two movies and let me know. ");
			System.out.println("Enter the name of the movie: ");
			String entered = input.nextLine();         // waiting for the user input 

			// as long as the user have type anything but the name Cinderella and Barbie
			while (!(entered.equalsIgnoreCase(thirdMovie)) && !(entered.equalsIgnoreCase(fourthMovie))) {

				if (entered.equalsIgnoreCase(movieList.get(0)) || entered.equalsIgnoreCase(movieList.get(1))) {
					System.out.println("You have to choose either " + thirdMovie + " or " + fourthMovie);

					
				} else {
					System.out.println("There is no such movie showing in our cinema. ");
				}

				entered = input.nextLine(); // stop the loop from looping forever

			}
			
			System.out.println("I would like to book a ticket for " + entered + "\n");

			if (entered.equalsIgnoreCase(thirdMovie)) {
				System.out.println("Ok. This is a movie you can book a ticket for." + "\n");
			} else if (entered.equalsIgnoreCase(fourthMovie)) {
				System.out.println("Ok. This is a movie you can book for." + " \n");
			}
			
			System.out.println("Would you like to pay for the movie straight away?");
			System.out.println("Enter Yes/No: ");
			
			String enteredYN = input.nextLine();
			String yes = "yes";
			String no = "no";
			
			while (!(enteredYN.equalsIgnoreCase(yes) && !(enteredYN.equalsIgnoreCase(no)))) {

				if (enteredYN.equalsIgnoreCase(no)) {

					System.out.println("No problem. I will see you next time");
					break;
				} else {
					System.out.println("You have to choose either Yes or No");
				}
				enteredYN = input.nextLine();

			}
			if (enteredYN.equalsIgnoreCase(yes)) {
				
				if (entered.equalsIgnoreCase(fourthMovie) && enteredYN.equalsIgnoreCase(yes))
				{
					Movie movie4 = new Movie("Barbie",20.0, "Tuesday 19:00");
					
					childA.bookMovie(movie4, employee3, false, childA); // invoking bookMovie
				}
				else if (entered.equalsIgnoreCase(thirdMovie) && enteredYN.equalsIgnoreCase(yes)) {
					childA.bookMovie(movie3, employee3, false, childA);
				}
				
				System.out.println("Would you like to view our food menu?");
				System.out.println("Enter Yes or No: ");
				
				

				File availableFood = new File("availablefood.txt"); // create a file object and pass my created file to it 
				Scanner food = new Scanner(availableFood);			// take data from the file 

				String enteredDecision = input.nextLine();   
				
				while (!(enteredDecision.equalsIgnoreCase(yes))) {

					if (enteredDecision.equalsIgnoreCase(no)) {
						break;
					}
					System.out.println("Sorry I didn't undestand. Is it yes or no?: ");
					enteredDecision = input.nextLine();
				}
			
				if (enteredDecision.equalsIgnoreCase(yes)) {

					System.out.println("Here you go:");

					while (food.hasNextLine()) {     // show everything that is inside my file 
						String line = food.nextLine();
						System.out.println(line);

					}
					System.out.println("Enjoy. Bye");
					food.close();
					
				}
				else if (enteredDecision.equalsIgnoreCase(no)) {
					System.out.println("Ok. Goodbye ");
					
				}
							
			
				
			}		
			input.close();
							
			childA.conversateWithEmployee(employee3, movie3);
			

	}

}
