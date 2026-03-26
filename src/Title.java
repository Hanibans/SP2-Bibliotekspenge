public abstract class Title { //superklasse
    String title;
    String literatureType;
    static final double RATE = 0.067574;

    Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;
    }

    //beregner royalty for titlen
    double calculateRoyalty() {
        //polymorfi - calculatePoints() kalder den version, der passer til subklassen
        return calculatePoints() * RATE;
    }

    //abstract metode - implementeres forskelligt i subklasser
    abstract double calculatePoints();

    /*
    calculatePoints() er abstract. Hver subklasse (PrintedBook, AudioBook)
    skal implementere den, fordi pointberegningen er forskellig
     */

    //konverter litteraturtype til talværdi
    double convertLiteratureType() {
        switch (literatureType) {
            case "BI", "TE":
                return 3.0;
            case "LYRIK":
                return 6.0;
            case "SKØN":
                return 1.7;
            case "FAG":
                return 1.0;
            default:
                return 0;
        }
    }
}
