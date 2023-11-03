package Lab05.Classes;

public class CD implements toBeStored{
    String artist;
    String title;
    int publishingYear;
    double weight;

    public CD(String artist, String title, int publishingYear) {
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
        this.weight = 0.1;
    }

    @Override
    public double weight() {
        return 0.1;
    }

    public String toString() {
        return "Artist: " + artist + "\nTitle: " + title + "\nPublishing Year: " + publishingYear + "\nWeight: " + weight;
    }
}
