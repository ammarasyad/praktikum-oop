package responsi4.soal4;

public class RedCard extends Card {
    public RedCard(double number){
        super(number);
    }
    @Override
    public Double value() {
        return number + 0.9;
    }

    @Override
    public void printInfo() {
        System.out.println("Kartu Merah: " + this.getNumber());
    }
}
