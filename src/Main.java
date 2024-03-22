import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        OOP reiskia object orianted programming


        Book tuscia1 = new Book();
        tuscia1.setTitle("grybu karas ir taika");
        tuscia1.setReleaseYear(1994);
        tuscia1.setPages(46);
        Book tuscia2 = new Book();
        tuscia2.setReleaseYear(2050);
        tuscia2.setPages(1);
        tuscia2.setTitle("niekas nenorėjo mirti. gyventi taip pat");
        Book tuscia3 = new Book();
        tuscia3.setReleaseYear(1941);
        tuscia3.setPages(1491);
        tuscia3.setTitle("War,war,war,war,war,war,war...");

        Book pilna1 = new Book("Pipi Longstockings", 160, 1945);
        Book pilna2 = new Book("Harry Potter and the Philosophers Stone", 223, 1997);
        Book pilna3 = new Book("12 Rules for Life", 448, 2018);

//        Book tuscia2 = new Book("",0,0);
//        Book tuscia3 = new Book();
//        tuscia.setTitle( "Pepe ilgakoine");


        ArrayList<Book> books = new ArrayList<>();
        books.add(tuscia1);
        books.add(tuscia2);
        books.add(tuscia3);
        books.add(pilna1);
        books.add(pilna2);
        books.add(pilna3);

        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getTitle() + " " + books.get(i).getPages() + " " + books.get(i).getReleaseYear());

        } for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));

        }




    }

}