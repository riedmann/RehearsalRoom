package at.ta.rehearsalRoom;

import java.util.List;

public class Musician {
    private String name;
    private int age;
    private String bandName;

    public Musician(String name, int age, String bandName) {
        this.name = name;
        this.age = age;
        this.bandName = bandName;
    }

    public static void makeMusic(List<Musician> musicianList) {
        for (Musician musician : musicianList) {
            musician.makeMusic();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    protected void makeMusic() {
        System.out.println("");
    }
}
