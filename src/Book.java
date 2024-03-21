public class Book { // Klases properties
    private String title;
    private int pages;
    private int releaseYear;

    public void setTitle(String title) { // Cia mano setteriai

        this.title = title;
    }

    public void setPages(int pages) {

        this.pages = pages;
    }

    public void setReleaseYear(int year) { // Cia mano setteriai

        this.releaseYear = year;
    }

    public String getTitle() { // Cia mano geteriai
        return this.title;
    }

    public int getPages() {
        return this.pages;
    }

    public int getReleaseYear() { // Cia mano geteriai
        return this.releaseYear;
    }
    public Book(){ // Tuscias konstruktorius

    } public Book(String title,int pages, int year){
        this.title = title;
        this.pages = pages;
        this.releaseYear = year;

    }
}
