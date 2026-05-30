public class Reader{
 public String name;
 public int capacity;
 public String[] book_name;
 public int num_of_book_name;

 public Reader(){
  this.name = "New user";
  this.capacity = 0;
  this.book_name = new String[0];
  System.out.println("A new reader is created!");
}

 public Reader(String name) {
  this.name = name;
  this.capacity = 2;
  this.book_name = new String[capacity];
  System.out.println("A new reader is created!");
 }

 public Reader(String name, int num) {
   this.name = name;
   this.capacity = num;
   this.book_name = new String[capacity];
   System.out.println("A new reader is created!");
 }

 public void readerInfo(){
  System.out.println("Name: " + this.name);
  System.out.println("Capacity: " + this.capacity);
  System.out.println("Books: ");
   if (num_of_book_name == 0) {
     System.out.println("No books added yet");
    } else {
       for (int i = 0; i < num_of_book_name; i++) {
        System.out.println("Book " + (i + 1) + ": " + book_name[i]);
        }
        }
    }

 public void addBook(String book) {
  if (num_of_book_name >= capacity) {
   System.out.println("No more capacity");
   return;
   }
  book_name[num_of_book_name] = book;
  num_of_book_name++;
    }

 public void updateCapacity(int input) {
  this.capacity = input;
  String[] newBookArray = new String[input];
   for (int i = 0; i < num_of_book_name && i < input; i++) {
    newBookArray[i] = book_name[i];
    }
   book_name = newBookArray;
    if (num_of_book_name > input) {
     num_of_book_name = input;
     }
   System.out.println("Capacity has changed to " + input);
    }
}
