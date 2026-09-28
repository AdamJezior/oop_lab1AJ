package ie.atu;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        book book1 = new book("Dune", "Frank Herbert", 412);
        book1.borrow();
        book1.returnBook();
        try {
            book1.returnBook();
        } catch (IllegalStateException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(book1.getStatus());
    }
}
