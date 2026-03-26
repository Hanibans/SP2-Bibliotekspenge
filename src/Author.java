import java.util.ArrayList;

public class Author {
    String name;
    ArrayList<Title> titles = new ArrayList<>();

    Author(String name) {
        this.name = name;
    }

    void addTitle(Title title) {
        titles.add(title);
    }

    double calculateRoyalties() {
        double total = 0;
        //for hver titel i forfatterens liste af titler
        for (Title t : titles) {
            //beregner royalty for de enkelte titler (point * RATE)
            //polymorfi - calculateRoyalty() kalder den rigtige version afhængigt af subklasse
            total += t.calculateRoyalty();
        }
        return Math.round(total * 100.0) / 100.0; //afrundet til 2 decimaler
    }

    String getName() {
        return name;
    }
}
