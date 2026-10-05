package ie.atu;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        book first = new book("Dune", "Frank Herbert", 412);
        book second = new book("Clean Code", "Robert C. Martin", 464);
        LibraryService service = new LibraryService();

        service.addBook(first);
        service.addBook(second);

        System.out.println("Total books in service: " +service.getBookCount());
        for(book book : service.getAllBooks()) {
            System.out.println(book.getTitle());
        }
    }
}
