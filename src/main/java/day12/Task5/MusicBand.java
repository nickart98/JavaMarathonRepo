package day12.Task5;

import java.util.List;

public class MusicBand {
    private final String name;
    private final int year;
    private final List<MusicArtist> musicArtist;

    public MusicBand(String name, int year, List<MusicArtist> musicArtist) {
        this.name = name;
        this.year = year;
        this.musicArtist=musicArtist;
    }
    public String toString(){
        return name + " (" + year + " г.) " + musicArtist;
    }

}
