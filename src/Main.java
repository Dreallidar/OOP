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
        ArrayList<Book> books = new ArrayList<>();
        books.add(tuscia1);
        books.add(tuscia2);
        books.add(tuscia3);
        books.add(pilna1);
        books.add(pilna2);
        books.add(pilna3);

//        Book tuscia2 = new Book("",0,0);
//        Book tuscia3 = new Book();
//        tuscia.setTitle( "Pepe ilgakoine");



        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getTitle() + " " + books.get(i).getPages() + " " + books.get(i).getReleaseYear());

        } for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));

        }

        Plant blankPlant = new Plant();
        Plant blankPlant2 = new Plant();
        Plant fullPlant = new Plant("Marijuana","Canabis indica / sativa",true,"East Asia",1.25,true);
        Plant fullPlant2 = new Plant("Psilocybe","Psilocybe semilanceata",true,"South America, is present in parts of most continents",0.15,true);
        blankPlant.setLatinPlantName("Allium cepa");
        blankPlant2.setLatinPlantName("Allium sativum");
        blankPlant.setPlantOriginContinent("Central Asia");
        blankPlant.setplantIsAnnual(false);
        blankPlant.setPlantHeightMeters(0.45);
        blankPlant.setPlantIsEdible(true);
        blankPlant2.setPlantIsEdible(false);
        blankPlant2.setPlantOriginContinent("Middle Asia");
        blankPlant2.setPlantHeightMeters(0.45);
        blankPlant2.setplantIsAnnual(true);
        blankPlant.setPlantName("Onion");
        blankPlant2.setPlantName("Garlic");

        ArrayList<Plant> plants = new ArrayList<>();
        plants.add(blankPlant2);
        plants.add(blankPlant);
        plants.add(fullPlant2);
        plants.add(fullPlant);



        for (Plant plant:plants){
            System.out.println(plant);
        }
        ArrayList<Employee> employees = new ArrayList<>();
        Employee Cletus = new Employee;





    }

}