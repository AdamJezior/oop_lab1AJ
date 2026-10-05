package ie.atu;

public class LibraryService {
    private static final int MAX_LOAN_DAYS = 14;

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
}
