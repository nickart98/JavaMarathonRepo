package day12.Task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>();
        List<String> membersMB1 = new ArrayList<>(Arrays.asList("Dan Reynolds", "Wayne Sermon", "Ben McKee", "Daniel Platzman"));
        List<String> membersMB2 = new ArrayList<>(Arrays.asList("Brian Fennell", "Branden Cate", "Rhett Stonelake", "Chris Bristol"));
        musicBands.add(new MusicBand("Imagine Dragons", 2008, membersMB1));
        musicBands.add(new MusicBand("Barcelona", 2005, membersMB2));
        merge(membersMB1,membersMB2);
        System.out.println(membersMB1);
        System.out.println(membersMB2);
    }

    public static void merge(List<String> membersIn, List<String> membersOut) {
        membersIn.addAll(membersOut);
        membersOut.clear();
    }
}
