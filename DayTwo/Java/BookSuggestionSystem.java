import java.util.Scanner;

import java.util.Random;

import java.util.ArrayList;

import java.util.Arrays;

public class BookSuggestionSystem{

    public static String suggestBook (ArrayList<String> books){

    Random rand = new Random();
    
    int index = rand.nextInt(books.size());

    String randomBook = books.get(index);

    return randomBook;}

    public static int getRandomPage(){

    Random rand = new Random();

    int randomPage = rand.nextInt(100) + 1;

    return randomPage;}

    public static ArrayList<String> addBook (ArrayList<String> books, String newBook){

    if (books.contains(newBook)) return books;

    else books.add(newBook);

    return books;}

    public static ArrayList<String> removeBook(ArrayList<String> books, String oldBook){

    books.remove(oldBook);

    return books;}

    public static ArrayList<String> updateBook(ArrayList<String> books, String oldTitle, String newTitle){
    
    int index = books.indexOf(oldTitle);

    books.set(index, newTitle);

    return books;
    }

    public static String showAllBooks (ArrayList<String> books){

    int bookNumber = 1;

    String display = "";

    for (String element : books){

    display += String.format("%d. %s%n", bookNumber++,element);
    } 

    return display;  
    }

}
