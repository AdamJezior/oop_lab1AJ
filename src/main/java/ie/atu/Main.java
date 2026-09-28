package ie.atu;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello World");

        book firstbook = createbook("Bloom","AJ", 21);
        book secondbook = createbook("Jungle","AJ", 62);
        book thirdbook = createbook("Pots","Alan", 38);

        firstbook.displaydetails();
        System.out.println("\n");
        secondbook.displaydetails();
        System.out.println("\n");
        thirdbook.displaydetails();
        System.out.println("\n");

        firstbook.borrowbook();
        firstbook.displaydetails();

        firstbook.borrowbook();
    }
    private static book createbook(String title, String author, int pageCount){
        book book = new book();
        book.title = title;
        book.author = author;
        book.pageCount = pageCount;
        return book;
    }
}
