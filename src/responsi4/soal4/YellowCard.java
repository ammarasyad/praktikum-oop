package responsi4.soal4;

public class YellowCard extends Card {
    public YellowCard(double number){
        super(number);
    }
    @Override
    public Double value() {
        return number + 0.6;
    }

    @Override
    public void printInfo() {
        System.out.println("Kartu Kuning: " + this.getNumber());
    }
}
