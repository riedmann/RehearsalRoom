package at.ta.rehearsalRoom;

public class Guitarist extends Musician {
    public Guitarist(String name, int age, String bandName) {
        super(name, age, bandName);
    }

    @Override
    protected void makeMusic() {
        System.out.println("BEASSV");
    }
}
