package day12.Task4;

import java.util.List;

public class MusicBand {
    private final String name;
    private final int year;
    private final List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String toString() {
        return name + " (" + year + ") " + members;
    }
}
