package day12.Task3;

public class MusicBand {
    private final String name;
    private final int year;

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }
    public String toString(){
        return name + " (" + year + ") ";
    }

    public int getYear() {
        return year;
    }
}
