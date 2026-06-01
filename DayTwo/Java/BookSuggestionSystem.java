import java.util.Scanner;

import java.util.Random;

import java.util.ArrayList;

import java.util.Arrays;

public class BookSuggestionSystem{

    public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);

    Scanner input = new Scanner(System.in);

    ArrayList<String> bookLibrary = new ArrayList<>(Arrays.asList("My Journey in Semicolon", "Who Move My Cheese", "Atomic Habit", "Subtle Art of Not Giving a Fuck"));

    while(true){

    System.out.println("\tWelcome to Book Suggestion System");

    
    String menu = """ 

    1. Get Suggestions

    2. Add Book

    3. Remove Book

    4. Update Book

    5. Show all Books 
    """;

    System.out.println(menu);

    System.out.print("Enter Operation or 0 to exit: ");

    int userInput = inputCollector.nextInt();

    switch(userInput){

    case 1:

    System.out.println("Book for the day:");

    System.out.printf("Book Title: %s%n", suggestBook(bookLibrary));

    System.out.printf("Page: %d%n", getRandomPage());

    System.out.print("Would you like to get another suggestion? (yes/no): ");

    while(true){

    String response = inputCollector.nextLine();

    if (response.equalsIgnoreCase("yes")){

    System.out.printf("Book Title: %s%n", suggestBook(bookLibrary));

    System.out.printf("Page: %d%n", getRandomPage());

    System.out.print("Would you like to get another suggestion? (yes/no): ");
    }
    if (response.equalsIgnoreCase("no"))
    break;

    }

    break;

    case 2:

    addBook(bookLibrary,input);
    break;

    case 3:

    removeBook(bookLibrary,input);

    break;

    case 4:

    updateBook(bookLibrary,input);

    break;

    case 5:

    showAllBooks(bookLibrary);

    break;

    case 0:

    System.out.println("Good bye!!");

    break;

    default:

    System.out.println("Invalid input");

    break;

    }
      
    if (userInput == 0) break;

    }
}
    public static String suggestBook (ArrayList<String> books){

    Random rand = new Random();
    
    int index = rand.nextInt(books.size());

    String randomBook = books.get(index);

    return randomBook;

    }

    public static int getRandomPage(){

    Random rand = new Random();

    int randomPage = rand.nextInt(100) + 1;

    return randomPage;
    }

    public static void addBook (ArrayList<String> books, Scanner inputCollector){

    System.out.print("Enter the book title: ");

    String newBook = inputCollector.nextLine();

    while(true){
    
    if (books.contains(newBook)){

    System.out.println("Already in the book library");

    System.out.print("Enter the book title: ");
    
    newBook = inputCollector.nextLine();

    }

    books.add(newBook);

    System.out.println("Book Added Successfully");

    break;
    }

    }

    public static void removeBook(ArrayList<String> books, Scanner inputCollector){

    System.out.print("Enter the book title to remove: ");

    String newBook = inputCollector.nextLine();

    books.remove(newBook);  

    System.out.println("Book Removed Successfully");
    }

    public static void updateBook(ArrayList<String> books, Scanner inputCollector){

    System.out.print("Enter the old title: ");

    String oldTitle = inputCollector.nextLine();

    while(true){

    if (books.contains(oldTitle)){

    int index = books.indexOf(oldTitle);

    System.out.print("Enter the new title: ");

    String newTitle = inputCollector.nextLine();

    books.set(index, newTitle);

    System.out.println("Book Upated Successfully");

    break;

    }

    System.out.println("Wrong Title");

    System.out.print("Enter the old title: ");

    oldTitle = inputCollector.nextLine();
    
    }
  
    }

    public static void showAllBooks (ArrayList<String> books){

    System.out.println("All Books");

    int bookNumber = 1;

    for (int count = 0; count < books.size(); count++){

    System.out.printf("%d. %s%n", bookNumber++,books.get(count));
    } 

    System.out.println();   
    }

}
