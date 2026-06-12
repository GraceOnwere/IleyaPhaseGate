from book_suggestion_system import *

book_library = ["My Journey in Semicolon", "Who Moved My Cheese", "Atomic Habit", "Subtle Art of Not Giving a Fuck"]


start_program = "start"

while start_program == start_program:

    message = """1. Get Suggestion

2. Add Book

3. Remove Book

4. Update Book

5. Show all Books """

    print(message)

    user_input = int(input("Enter Operation or 0 to exit: "))

    while user_input != 0:

        match user_input:

            case 1:

                print("Book for the day:")

                print(f"Book Title: {suggest_book(book_library)}")

                print(f"Page: {get_random_page()}")

                print()

                user_response = input("Would you like to get another suggestion? (yes/no): ").strip()

                while user_response.lower() == "yes":

                    print("Book for the day:")

                    print(f"Book Title: {suggest_book(book_library)}")

                    print(f"Page: {get_random_page()}")

                    print()

                    user_response = input("Would you like to get another suggestion? (yes/no): ").strip()


                while user_response.lower() != "no":

                    print("Invalid Option")

                    user_response = input("Would you like to get another suggestion? (yes/no): ").strip()

                break
                
            case 2:

                new_book = input("Enter the book title: ").strip()

                while new_book in book_library:

                    print("Already in the book library")

                    new_book = input("Enter the book title: ").strip()
            
                add_book(book_library,new_book)

                print("Book Added Successfully")

                break

            case 3:

                book_title = input("Enter the book title to remove: ").strip()

                while book_title not in book_library:

                    print("Sorry Book not in Library,hence cannot be removed")

                    book_title = input("Enter the book title to remove: ").strip()

                remove_book(book_library,book_title)

                print("Book Removed Successfully")

                break

            case 4:

                old_book = input("Enter the old title: ").strip()

                while old_book not in book_library:

                    print("Wrong Title")
        
                    old_book = input("Enter the old title: ").strip()

                new_book = input("Enter the new book title: ")

                update_book(book_library,old_book,new_book)

                break
                    
            case 5:

                print("All books")

                show_all_books(book_library)
                break

            case invalid_response:

                print(f"Sorry {invalid_response} is not a valid Operation")
                break

    if user_input == 0: 
        print("Good Byee!!!")    
        break
