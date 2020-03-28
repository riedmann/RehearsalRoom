package at.ta.rehearsalRoom;

public class BassGuitarist extends Musician {
    public BassGuitarist(String name, int age, String bandName) {
        super(name, age, bandName);
    }

    @Override
    protected void makeMusic() {
        System.out.println("wummm");
    }
}
