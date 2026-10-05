package ie.atu;

public class book {
    private String title;
    private String author;
    private int pageCount;
    private BookStatus status;

    public book(String title, String author, int pageCount) {
        if(title==null||title.isBlank()){
            throw new IllegalArgumentException("title cannot be blank");
        }
        if(author==null||author.isBlank()){
            throw new IllegalArgumentException("author cannot be blank");
        }
        if(pageCount<=0){
            throw new IllegalArgumentException("pageCount cannot be 0 or less than 0");
        }

        this.title = title.trim();
        this.author = author.trim();
        this.pageCount = pageCount;
        this.status = BookStatus.Available;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void borrow() {
        if(status==BookStatus.onLoan){
            throw new IllegalStateException("Book already borrowed");

        }
        status=BookStatus.onLoan;
    }

    public void returnBook() {
        if(status==BookStatus.Available){
            throw new IllegalStateException("book already available");
        }
        status=BookStatus.Available;
    }
}
