package responsi4.soal4;

public class GreenCard extends Card {
    public GreenCard(double number){
        super(number);
    }
    @Override
    public Double value() {
        return number;
    }

    @Override
    public void printInfo() {
        System.out.println("Kartu Hijau: " + this.getNumber());
    }
}
