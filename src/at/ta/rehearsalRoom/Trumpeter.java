package at.ta.rehearsalRoom;

public class Trumpeter extends Musician {
    public Trumpeter(String name, int age, String bandName) {
        super(name, age, bandName);
    }

    @Override
    protected void makeMusic() {
        System.out.println("trööööt");
    }
}
