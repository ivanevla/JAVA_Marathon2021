package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBandList = new ArrayList<>();
        musicBandList.add(new MusicBand("OneRepublic", 2002));
        musicBandList.add(new MusicBand("Sia", 1990));
        musicBandList.add(new MusicBand("Lady Gaga", 2001));
        musicBandList.add(new MusicBand("HIM", 1991));
        musicBandList.add(new MusicBand("Imagine Dragons", 2008));
        musicBandList.add(new MusicBand("White Lies", 2007));
        musicBandList.add(new MusicBand("Katy Perry", 2001));
        musicBandList.add(new MusicBand("Pink", 1995));
        musicBandList.add(new MusicBand("Radiohead", 1985));
        musicBandList.add(new MusicBand("Sunrise Avenue", 2002));

        Collections.shuffle(musicBandList);

        List<MusicBand> musicBandList2000 = groupsAfter2000(musicBandList);

        musicBandList.forEach(band -> System.out.println(band.getName()));
        System.out.println(" ----- ");
        musicBandList2000.forEach(band -> System.out.println(band.getName()));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        return bands.stream()
                .filter(band -> band.getYear() >= 2000)
                .collect(Collectors.toList());
    }
}
