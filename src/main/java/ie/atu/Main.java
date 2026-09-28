package ie.atu;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        book myBook= new book("dune","John",219);
        System.out.println(myBook.getTitle());
        System.out.println(myBook.getAuthor());
        System.out.println(myBook.getPageCount());



    }
}
