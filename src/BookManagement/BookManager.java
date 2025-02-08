package BookManagement;
import java.util.Scanner;

public class BookManager {
    private Book[] bookList; // Array to manage books
    private int bookCount; // To keep track of how many books are in the array
 
    // Constructor to initialize the bookList array with a fixed size
    public BookManager(int capacity) {
        bookList = new Book[capacity]; // Create array with the given capacity
        bookCount = 0; // Initialize count to 0
    }
 
    // Method to add a book to the list
    public void addBook(Book book) {
        if (bookCount < bookList.length) {
            bookList[bookCount] = book;
            bookCount++; // Increment count after adding a book
        } else {
            System.out.println("Cannot add more books, array is full.");
        }
    }
 
    // Method to display all books
    public void displayAllBooks() {
        if (bookCount == 0) {
            System.out.println("No books available.");
        } else {
            for (int i = 0; i < bookCount; i++) {
                bookList[i].displayBookInfo();
                System.out.println("-------------------------");
            }
        }
    }
 
    // Method to search for books by title or author
    public void searchBooks(String keyword) {
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (bookList[i].getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                bookList[i].getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                bookList[i].displayBookInfo();
                System.out.println("-------------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found matching '" + keyword + "'.");
        }
    }
 
    // Method to remove a book by title
    public void removeBook(String title) {
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (bookList[i].getTitle().equalsIgnoreCase(title)) {
                // Shift all elements to the left
                for (int j = i; j < bookCount - 1; j++) {
                    bookList[j] = bookList[j + 1];
                }
                bookList[bookCount - 1] = null; // Nullify the last element
                bookCount--; // Decrement book count
                found = true;
                System.out.println("Book '" + title + "' has been removed.");
                break;
            }
        }
        if (!found) {
            System.out.println("Book with title '" + title + "' not found.");
        }
    }
 
    // Method to update book details
    public void updateBook(String oldTitle, String newTitle, String newAuthor, double newPrice) {
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (bookList[i].getTitle().equalsIgnoreCase(oldTitle)) {
                bookList[i].setTitle(newTitle);
                bookList[i].setAuthor(newAuthor);
                bookList[i].setPrice(newPrice);
                found = true;
                System.out.println("Book details updated successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("Book with title '" + oldTitle + "' not found.");
        }
    }
 
    // Method to sort books by price
    public void sortBooksByPrice() {
        for (int i = 0; i < bookCount - 1; i++) {
            for (int j = i + 1; j < bookCount; j++) {
                if (bookList[i].getPrice() > bookList[j].getPrice()) {
                    Book temp = bookList[i];
                    bookList[i] = bookList[j];
                    bookList[j] = temp;
                }
            }
        }
        System.out.println("Books sorted by price.");
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Ask user for the number of books they want to manage
        System.out.print("Enter the number of books you want to manage: ");
        int capacity = scanner.nextInt();
        scanner.nextLine(); // Consume newline left by nextInt()
 
        // Creating BookManager instance with the specified capacity
        BookManager manager = new BookManager(capacity);
 
        // Loop to take user input for each book
        for (int i = 0; i < capacity; i++) {
            System.out.println("Enter details for Book " + (i + 1));
 
            // Get the book type (Regular Book or EBook)
            System.out.print("Is this a regular book (r) or an ebook (e)? ");
            String bookType = scanner.nextLine().toLowerCase();
 
            // Book details common to both Book and EBook
            System.out.print("Enter the title: ");
            String title = scanner.nextLine();
 
            System.out.print("Enter the author: ");
            String author = scanner.nextLine();
 
            System.out.print("Enter the price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume newline left by nextDouble()
 
            if (bookType.equals("r")) {
                // Regular Book
                Book book = new Book(title, author, price);
                manager.addBook(book);
            } else if (bookType.equals("e")) {
                // EBook
                System.out.print("Enter the file size (MB): ");
                double fileSize = scanner.nextDouble();
                scanner.nextLine(); // Consume newline left by nextDouble()
 
                System.out.print("Enter the ebook format (e.g., PDF, EPUB): ");
                String format = scanner.nextLine();
 
                EBook eBook = new EBook(title, author, price, fileSize, format);
                manager.addBook(eBook);
            } else {
                System.out.println("Invalid book type. Skipping this entry.");
            }
 
            System.out.println("-------------------------");
        }
 
        // Main menu loop for interaction
        boolean running = true;
        while (running) {
            System.out.println("Choose an option:");
            System.out.println("1. Display all books");
            System.out.println("2. Search books by title or author");
            System.out.println("3. Remove a book by title");
            System.out.println("4. Update a book's details");
            System.out.println("5. Sort books by price");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left by nextInt()
 
            switch (choice) {
                case 1:
                    manager.displayAllBooks();
                    break;
                case 2:
                    System.out.print("Enter search keyword (title/author): ");
                    String keyword = scanner.nextLine();
                    manager.searchBooks(keyword);
                    break;
                case 3:
                    System.out.print("Enter the title of the book to remove: ");
                    String titleToRemove = scanner.nextLine();
                    manager.removeBook(titleToRemove);
                    break;
                case 4:
                    System.out.print("Enter the title of the book to update: ");
                    String oldTitle = scanner.nextLine();
                    System.out.print("Enter the new title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter the new author: ");
                    String newAuthor = scanner.nextLine();
                    System.out.print("Enter the new price: ");
                    double newPrice = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    manager.updateBook(oldTitle, newTitle, newAuthor, newPrice);
                    break;
                case 5:
                    manager.sortBooksByPrice();
                    manager.displayAllBooks();
                    break;
                case 6:
                    running = false;
                    System.out.println("Exiting the Book Manager.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
 
        scanner.close(); // Close the scanner object
    }
}


