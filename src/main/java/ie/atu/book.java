package ie.atu;

public class book {
    public String title;
    public String author;
    public int pageCount;
    public boolean available = true;

    public void displaydetails(){
        System.out.println("book: " + title);
        System.out.println("book Author: " + author);
        System.out.println("book Page Count: " + pageCount);
        System.out.println("book avalibility: " + available);
    }

}
