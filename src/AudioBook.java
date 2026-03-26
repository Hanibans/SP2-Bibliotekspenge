public class AudioBook extends Title { //subklasse (nedarvning)
    int durationInMinutes;
    int copies;

    AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType);
        this.copies = copies;
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    double calculatePoints() {
        return (durationInMinutes * 0.5) * convertLiteratureType() * copies;
    }
}
