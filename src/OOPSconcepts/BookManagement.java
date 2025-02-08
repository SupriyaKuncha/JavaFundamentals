package OOPSconcepts;

import java.util.Scanner;

public class BookManagement {
	public static void main(String[] args) {
        // Creating a book object using the constructor
		Scanner sc = new Scanner(System.in);
		System.out.print("Title: ");
		String title = sc.next();
		System.out.print("Author: ");
		String author = sc.next();
		System.out.print("Price: ");
		double price = sc.nextDouble();	
		boolean availability = true;
        Book book1 = new Book(title,author,price,availability);
 
        // Displaying initial book details
        System.out.println("Book Details:");
        book1.displayBookDetails();

            
        sc.close();
    }

}
