package responsi5.soal4;

public class Panda extends Animal {
    protected static final String species = "Pandamus Maximus";
    public Panda(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("nyam nyam makan bambu");
    }

    @Override
    public String getSpecies() {
        return species;
    }

    @Override
    public boolean isFriendly() {
        return true;
    }
}