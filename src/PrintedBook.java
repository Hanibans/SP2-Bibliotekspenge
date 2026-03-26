public class PrintedBook extends Title { //subklasse (nedarvning)
    int pages;
    int copies;

    PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType);
        this.copies = copies;
        this.pages = pages;
    }

    @Override
    double calculatePoints() {
        return pages * convertLiteratureType() * copies;
    }
}
