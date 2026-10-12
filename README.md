Lab4: 
libraryService now owns a list of books instead pf working with a single book.
List<Book>: this tells the compiler to create an array from the objects stored in the Book class.
books.add & final: final locks the address of List that being the class Book, objects owned by Book are not affected.
enhanced for loop: represents a manual search for each book until it runs out of names then it returns false.
findBookByTitle(): for a known book returns the title of the book, for an unknown book it returns a null.
removeBook(): it reuses the findBookByTitle function because it is more efficient, it also returns a null for incorrect entries which makes the if statement simpler.
Main: creates objects, prints outputs
LibraryService: List owner, search Books and check loan duration
Book: decides if books can be borrowed, writes variables into objects, private variables

project Built successfully