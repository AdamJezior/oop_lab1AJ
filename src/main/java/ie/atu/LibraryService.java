package ie.atu;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private static final int MAX_LOAN_DAYS = 14;
    private final List<book> books=new ArrayList<book>();

    public void loanBook(book book1, int loanDays) {
        if (book1 == null) {
            throw new IllegalArgumentException(
                    "Book must not be null");
        }
        if (loanDays < 1 || loanDays > MAX_LOAN_DAYS) {
            throw new IllegalArgumentException(
                    "Loan days must be from 1 to 14");
        }
        book1.borrow();
    }

    public void returnBook(book book1) {
        if (book1 == null) {
            throw new IllegalArgumentException("Book must not be null");
        }
        book1.returnBook();
    }

    public void addBook(book book1) {
        if (book1 == null) {
            throw new IllegalArgumentException("Book must not be null");
        }
        books.add(book1);
    }

    public int getBookCount() {
        return books.size();
    }

    public List<book> getAllBooks() {
        return new ArrayList<>(books);
    }
}
