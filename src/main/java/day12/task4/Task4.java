package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Lady Gaga");
        MusicBand musicBand1 = new MusicBand("Lady Gaga", 2001, members1);

        List<String> members2 = new ArrayList<>();
        members1.add("Katy Perry");
        MusicBand musicBand2 = new MusicBand("Katy Perry", 2001, members2);

        MusicBand.transferMembers(musicBand2, musicBand1);
        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
