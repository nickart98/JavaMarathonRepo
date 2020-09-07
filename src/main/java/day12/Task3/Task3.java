package day12.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(new MusicBand("Nirvana", 1987));
        musicBands.add(new MusicBand("Red Hot Chili Peppers", 1983));
        musicBands.add(new MusicBand("Green Day", 1986));
        musicBands.add(new MusicBand("Scorpions", 1965));
        musicBands.add(new MusicBand("Queen", 1970));
        musicBands.add(new MusicBand("The Chainsmokers", 2012));
        musicBands.add(new MusicBand("Arctic Monkeys", 2002));
        musicBands.add(new MusicBand("Imagine Dragons", 2008));
        musicBands.add(new MusicBand("Barcelona", 2005));
        musicBands.add(new MusicBand("Far East Movement", 2003));
        Collections.shuffle(musicBands);
        List<MusicBand> mBandsAfter2k = new ArrayList<>();
        for (MusicBand musicBand : musicBands) {
            if (musicBand.getYear() >= 2000)
                mBandsAfter2k.add(musicBand);
        }
        System.out.println(musicBands);
        System.out.println(mBandsAfter2k);
    }
}
