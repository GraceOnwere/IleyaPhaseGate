import random

#def return_book_library():
#
#    book_library = ["My Journey in Semicolon", "Who Moved My Cheese", "Atomic Habit", "Subtle Art of Not Giving a Fuck"]
#
#    return book_library

def suggest_book(book_library):

    random_book = random.choice(book_library)

    return random_book

def get_random_page():

    random_page = random.randint(1,100)

    return random_page

def add_book(book_library,new_book):

    book_library.append(new_book)

    return book_library

def remove_book(book_library, old_book):

    book_library.remove(old_book)

    return book_library

def update_book(book_library,old_book,new_book): 
   
    index = book_library.index(old_book)

    book_library[index] = new_book

    return book_library

def show_all_books(book_library):    

    book_number = 1

    for book in book_library:

        print(f"{book_number}. {book}")

        book_number = book_number + 1

    print()

        

    
    
