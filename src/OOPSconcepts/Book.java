package OOPSconcepts;

public class Book {
	
	    String title;
	    String author;
	    double price;
	    boolean availability;
	 
	    // Constructor to initialize the Book object
	    public Book(String title, String author, double price, boolean availability) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	        this.availability = availability;
	        
	    }
	 
	    public boolean isAvailability() {
			return availability;
		}

		public void setAvailability(boolean availability) {
			this.availability = availability;
		}

		// Getter for title
	    public String getTitle() {
	        return title;
	    }
	 
	    // Setter for title
	    public void setTitle(String title) {
	        this.title = title;
	    }
	 
	    // Getter for author
	    public String getAuthor() {
	        return author;
	    }
	 
	    // Setter for author
	    public void setAuthor(String author) {
	        this.author = author;
	    }
	 
	    // Getter for price
	    public double getPrice() {
	        return price;
	    }
	 
	    // Setter for price
	    public void setPrice(double price) {
	        this.price = price;
	    }
	 
	    // Method to display book details
	    public void displayBookDetails() {
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Price: " + price +" /-");
	        if(availability == true) {
	        	System.out.println("Currently available");
	        }else {
	        	System.out.println("Not Available");
	        }
	    }
	}
