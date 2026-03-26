import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryRoyaltyCalculatorTest {

    @Test
    public void main() {
        Author olga = new Author("Olga Ravn");

        PrintedBook pb1 = new PrintedBook("Celestine", "SKØN", 140, 166);
        AudioBook ab1 = new AudioBook("Celestine", "SKØN", 140, 192);
        PrintedBook pb2 = new PrintedBook("Lyrik Eksempel", "LYRIK", 50, 80);
        AudioBook ab2 = new AudioBook("Fagbog Eksempel", "FAG", 75, 35);

        olga.addTitle(pb1);
        olga.addTitle(ab1);
        olga.addTitle(pb2);
        olga.addTitle(ab2);

        double royalties = olga.calculateRoyalties();
        System.out.println(olga.getName() + ": " + royalties + "kr");
    }

}