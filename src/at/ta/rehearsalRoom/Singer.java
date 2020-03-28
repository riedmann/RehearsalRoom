package at.ta.rehearsalRoom;

public class Singer extends Musician {

    public Singer(String name, int age, String bandName) {
        super(name, age, bandName);
    }

    @Override
    protected void makeMusic() {
        System.out.println("Lalalal");
    }

}
