package responsi4.soal4;

public class BlueCard extends Card {
    public BlueCard(double number){
        super(number);
    }
    @Override
    public Double value() {
        return number + 0.3;
    }

    @Override
    public void printInfo() {
        System.out.println("Kartu Biru: " + this.getNumber());
    }
}
