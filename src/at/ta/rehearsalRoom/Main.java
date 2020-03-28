package at.ta.rehearsalRoom;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Singer singer = new Singer("Peter", 25, "ALF");
        Guitarist guitarist = new Guitarist("Hans", 20, "ALF");
        BassGuitarist bassGuitarist = new BassGuitarist("Franz", 30, "ALF");
        Trumpeter trumpeter = new Trumpeter("Klaus", 21, "ALF");
        BackgroundSinger backgroundSinger = new BackgroundSinger("Ines", 20, "ALF");

        List<Musician> musicianList = new ArrayList<>();
        musicianList.add(singer);
        musicianList.add(guitarist);
        musicianList.add(bassGuitarist);
        musicianList.add(backgroundSinger);
        musicianList.add(trumpeter);


        Musician.makeMusic(musicianList);


    }


}
