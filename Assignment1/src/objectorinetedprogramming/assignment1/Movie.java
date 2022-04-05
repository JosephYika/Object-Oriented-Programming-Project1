package objectorinetedprogramming.assignment1;

/**
   Movie class represents the specification for the movie object. A movie has certain attributes such as title, price.
   It also has the date of showing and the age rating. 
 * @author Jozef Yika
 *
 */
public class Movie {
	
	//FIELDS
	/**
	  	Instance variable title is the title of the movie
	  	Instance variable price is the price of the movie
	  	Instance variable datOfShowing is the showing date of the movie
	  	Instance variable rating is the age rating for the movie (i.e 7 + , 15 + etc)
	 */
	private String title; 
	private double price;
	private String dateOfShowing;
	private int rating;
	
	
	
	
	// CONSTRUCTORS
	/**
	  A default constructor sets 4 values as shown below. 
	 */
	public Movie() {
		
		this("Batman", 20, "Friday, 15:30");
	}
	
	/**
	 	Custom constructor accepts 3 parameters as shown below. The values when passed in the main method are assigned 
	 	to the attributes. 
	 * @param title is the tile of the movie
	 * @param price is the price of the movie
	 * @param dateOfShowing is the showing date 
	 */
	public Movie(String title, double price, String dateOfShowing) {
		
		this.title = title;
		this.price = price;
		this.dateOfShowing = dateOfShowing;
	}
	
	
	//METHODS
	/**
	 	Sets the title of the movie. 
	 	
	 * @param title is the title of the movie
	 */
	public void setTitle(String title) {
		
		this.title = title;
	}
	/**
	 * Returns the title of the movie
	   
	 * @return the tile of the movie 
	 */
	public String getTitle() {
		
		return title;
	}
	/**
	 * Sets the price of the movie 
	 * @param price Price of the movie 
	 */
	public void setPrice(double price) {
	
		this.price = price;
	}
	/**
	 * Returns the current value of the variable price 
	 * @return Price of the movie 
	 */
	public double getPrice() {
		
		return price;
	}
	/**
	 * Sets the showing date of the movie 
	 * @param dateOfShowing Showing date of the movie 
	 */
	public void setDateOfShowing(String dateOfShowing) {
		
		this.dateOfShowing = dateOfShowing;
	}
	/**
	 * Returns the current value stored in the variable dateOfShowing 
	 * @return Showing date of the movie 
	 */
	public String getDateOfShowing() {
		
		return dateOfShowing;
	}
	/**
	 * Sets the age rating for the movie 
	 * @param rating Age rating for the movie 
	 */
	public void setRating(int rating) {
		
		this.rating = rating;
	}
	/**
	 * 
	 * Returns the age rating of the movie 
	 * @return the current value stored in the variable rating 
	 */
	public int getRating() {
		
		return rating;
	}
	
	
	
	
	
	
	/**
	  Overriding toString method. I am using getClass because I just wanted to show that I am aware of this option.
	  This could be omitted. First I am creating a variable of data type class 'Class' and assigning getClass method 
	  to it. 
	  
	  getClass method resides in the Object class. 
	  getClass method returns the instance of class which is called 'Class'. 
	  
	  In the body of this method I create a variable 'm' ( for movie) of type 'Class' and assign to it getClass method.
	  Now since I know that getClass returns the instance of Class , this means that all of the method in that class 
	  will be available to use here. Then I invoke getSimpleName method on the reference variable 'm' which returns 
	  the name of my class - which is Movie . 
	  
	  I need to invoke getSimpleName on 'm' because 'm' holds a reference to getClass and getClass contains information
	  about our class. 
	  
	  Again this is just to show another possibility instead of writing return Movie ...etc 
	  
	 */
	public String toString() {
		
		Class<? extends Movie> m = getClass();
		return m.getSimpleName() + "[Title = " + title + "," + " Price " + price + "£" + ", " + " Date Of Showing: " + dateOfShowing + "]";
	}
	
	
}
