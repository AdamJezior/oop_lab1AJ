package ie.atu;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private static final int MAX_LOAN_DAYS = 14;
    private final List<Book> books=new ArrayList<Book>();

    public boolean loanBook(String title, int loanDays){
        if(loanDays<1||loanDays>MAX_LOAN_DAYS){
            throw new IllegalArgumentException("Loan days must range from 1 to 14");
        }
        Book book1=findBookByTitle(title);
        if(book1==null){
            return false;
        }
        book1.borrow();
        return true;
    }

    public boolean returnBook(String title) {
       Book book1=findBookByTitle(title);

       if(book1==null){
           return false;
       }
       book1.returnBook();
       return true;
    }

    public void addBook(Book book1) {
        if (book1 == null) {
            throw new IllegalArgumentException("Book must not be null");
        }
        books.add(book1);
    }

    public int getBookCount() {
        return books.size();
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }

    public Book findBookByTitle(String title) {
        for (Book book1 : books) {
            if(book1.getTitle().equalsIgnoreCase(title)) {
                return book1;
            }
        }
        return null;
    }

    public boolean removeBook(String title) {

        if (findBookByTitle(title)==null) {
            //throw new IllegalArgumentException("Book not available");
            return false;
        }
        else{
            books.remove(findBookByTitle(title));
            return true;
        }

    }
}
