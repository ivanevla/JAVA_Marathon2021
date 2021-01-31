package day12.task5;


import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Lady Gaga", 34));
        MusicBand musicBand1 = new MusicBand("Lady Gaga", 2001, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members1.add(new MusicArtist("Katy Perry", 36));
        MusicBand musicBand2 = new MusicBand("Katy Perry", 2001, members2);

        MusicBand.transferMembers(musicBand2, musicBand1);
        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
