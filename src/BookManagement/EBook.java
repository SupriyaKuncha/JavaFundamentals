package BookManagement;


public class EBook extends Book {
 private double fileSize; 
 private String format; 

 
 public EBook(String title, String author, double price, double fileSize, String format) {
     super(title, author, price); 
     this.fileSize = fileSize;
     this.format = format;
 }

 
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

 
 @Override
 public void displayBookInfo() {
     super.displayBookInfo(); // Display base book info
     System.out.println("File Size: " + fileSize + " MB");
     System.out.println("Format: " + format);
 }
}
