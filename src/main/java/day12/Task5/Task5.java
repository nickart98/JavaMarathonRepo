package day12.Task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>();
        List<MusicArtist> membersMB1 = new ArrayList<>(Arrays.asList(
                new MusicArtist("Dan Reynolds", 33),
                new MusicArtist("Wayne Sermon", 36),
                new MusicArtist("Ben McKee", 35),
                new MusicArtist("Daniel Platzman", 33)));
        List<MusicArtist> membersMB2 = new ArrayList<>(Arrays.asList(
                new MusicArtist("Brian Fennell", 37),
                new MusicArtist("Branden Cate", 32),
                new MusicArtist("Rhett Stonelake", 33),
                new MusicArtist("Chris Bristol", 35)));
        musicBands.add(new MusicBand("Imagine Dragons", 2008, membersMB1));
        musicBands.add(new MusicBand("Barcelona", 2005, membersMB2));
        System.out.println(musicBands);
        merge(membersMB1, membersMB2);
        System.out.println(musicBands);
    }

    public static void merge(List<MusicArtist> membersIn, List<MusicArtist> membersOut) {
        membersIn.addAll(membersOut);
        membersOut.clear();
    }
}
