import java.util.Scanner;

import java.util.Random;

import java.util.ArrayList;

import java.util.Arrays;

public class Main{

    public static void main(String [] args){

    Scanner inputCollector = new Scanner(System.in);

    ArrayList<String> bookLibrary = new ArrayList<>(Arrays.asList("My Journey in Semicolon", "Who Move My Cheese", "Atomic Habit", "Subtle Art of Not Giving a Fuck"));

    String startProgram = "start";

    while(startProgram.equals("start")){

    System.out.println("\tWelcome to Book Suggestion System");

    
    String menu = """ 

    1. Get Suggestions

    2. Add Book

    3. Remove Book

    4. Update Book

    5. Show all Books 

    0. exit program
    """;

    System.out.println(menu);

    System.out.print("Enter Operation or 0 to exit: ");

    int userInput = inputCollector.nextInt();
    inputCollector.nextLine();

    switch(userInput){

    case 1:

    System.out.println("Book for the Day");

    System.out.printf("Book Title: %s%n", BookSuggestionSystem.suggestBook(bookLibrary));

    System.out.printf("Page: %d%n", BookSuggestionSystem.getRandomPage());

    System.out.print("Would you like to get another suggestion? (yes/no): ");

    String response = inputCollector.nextLine().trim();

        while(response.equalsIgnoreCase("yes")){

            System.out.println("Book for the Day");

            System.out.printf("Book Title: %s%n", BookSuggestionSystem.suggestBook(bookLibrary));

            System.out.printf("Page: %d%n", BookSuggestionSystem.getRandomPage());

            System.out.print("Would you like to get another suggestion? (yes/no): ");

            response = inputCollector.nextLine().trim();}

        while(!response.equalsIgnoreCase("no")){

                System.out.println("Invalid Option");

                System.out.print("Would you like to get another suggestion? (yes/no): ");

                response = inputCollector.nextLine().trim();}  
        break;

    case 2:

    System.out.print("Enter the book title: ");

    String newBook = inputCollector.nextLine().trim();

    while(bookLibrary.contains(newBook)){
    
    System.out.println("Already in the book library");

    System.out.print("Enter the book title: ");
    
    newBook = inputCollector.nextLine().trim();}
    
    BookSuggestionSystem.addBook(bookLibrary,newBook);

    System.out.println("Book Added Successfully");

    break;

    case 3:

    System.out.print("Enter the book title to remove: ");

    String newwBook = inputCollector.nextLine();

    while(!bookLibrary.contains(newwBook)){

    System.out.println("Sorry book not in Library,hence cannot be removed");

    System.out.print("Enter the book title to remove: ");

    newwBook = inputCollector.nextLine();}
    
    System.out.println("Book Removed Successfully");

    BookSuggestionSystem.removeBook(bookLibrary,newwBook);

    break;

    case 4:

    System.out.print("Enter the old title: ");

    String oldTitle = inputCollector.nextLine();

    while(!bookLibrary.contains(oldTitle)){

    System.out.println("Wrong Title");

    System.out.print("Enter the old title: ");

    oldTitle = inputCollector.nextLine();}
    
    System.out.print("Enter the new title: ");

    String newTitle = inputCollector.nextLine();

    BookSuggestionSystem.updateBook(bookLibrary, oldTitle,newTitle);

    System.out.println("Book Upated Successfully");

    break;

    case 5:

    System.out.println("All Books");

    String display = BookSuggestionSystem.showAllBooks(bookLibrary);

    System.out.println(display);

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
}
