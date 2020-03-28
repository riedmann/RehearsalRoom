package at.ta.rehearsalRoom;

public class BackgroundSinger extends Musician {
    public BackgroundSinger(String name, int age, String bandName) {
        super(name, age, bandName);
    }

    @Override
    protected void makeMusic() {
        System.out.println("AAAAAAAAAAAAA");
    }
}
