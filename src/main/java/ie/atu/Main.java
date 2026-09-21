package ie.atu;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello World");

        book firstbook = new book();

        firstbook.title = "Bloom";
        firstbook.author = "AJ";
        firstbook.pageCount = 20;
        firstbook.available = true;

        firstbook.displaydetails();
        System.out.println("\n");

        book secondbook = new book();
        secondbook.title = "Jungle";
        secondbook.author = "AJ";
        secondbook.pageCount = 60;
        secondbook.available = true;
        secondbook.displaydetails();
    }
}