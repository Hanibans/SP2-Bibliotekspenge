public class Main {
    public static void main(String[] args) {
        Author olga = new Author("Olga Ravn");

        PrintedBook pb = new PrintedBook("Celestine", "SKØN", 140, 166);
        AudioBook ab = new AudioBook("Celestine", "SKØN", 140, 192);

        olga.addTitle(pb);
        olga.addTitle(ab);

        //beregner samlede royalties
        double royalties = olga.calculateRoyalties();

        System.out.println(olga.getName() + ": " + royalties + " kr");
    }
}
