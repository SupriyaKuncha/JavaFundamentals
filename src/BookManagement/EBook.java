package BookManagement;

//EBook class inherits from Book class
public class EBook extends Book {
 private double fileSize; // in MB
 private String format; // format of the eBook (e.g., PDF, EPUB)

 // Constructor
 public EBook(String title, String author, double price, double fileSize, String format) {
     super(title, author, price); // Call the constructor of the superclass (Book)
     this.fileSize = fileSize;
     this.format = format;
 }

 // Getter and Setter methods for fileSize and format
 public double getFileSize() {
     return fileSize;
 }

 public void setFileSize(double fileSize) {
     this.fileSize = fileSize;
 }

 public String getFormat() {
     return format;
 }

 public void setFormat(String format) {
     this.format = format;
 }

 // Overridden method to display EBook info
 @Override
 public void displayBookInfo() {
     super.displayBookInfo(); // Display base book info
     System.out.println("File Size: " + fileSize + " MB");
     System.out.println("Format: " + format);
 }
}
