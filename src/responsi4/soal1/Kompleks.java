package responsi4.soal1;

public class Kompleks {

    private static int n_kompleks = 0;
    private int real;
    private int imaginer;

    public Kompleks() {
        this(0, 0);
    }

    public Kompleks(int real, int imaginer){
        this.real = real;
        this.imaginer = imaginer;
        n_kompleks++;
    }

    public int getReal() {
        return real;
    }

    public int getImaginer() {
        return imaginer;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImaginer(int imaginer) {
        this.imaginer = imaginer;
    }

    public Kompleks plus(Kompleks b) {
        return new Kompleks(this.real + b.real, this.imaginer + b.imaginer);
    }

    public Kompleks minus(Kompleks b) {
        return new Kompleks(this.real - b.real, this.imaginer - b.imaginer);
    }

    public Kompleks multiply(Kompleks b) {
        return new Kompleks(this.real * b.real - this.imaginer * b.imaginer, this.real * b.imaginer + this.imaginer * b.real);
    }

    public Kompleks multiply(int b) {
        return new Kompleks(this.real * b, this.imaginer * b);
    }

    public static int countKompleksInstance() {
        return n_kompleks;
    }

    public void print() {
        if (imaginer == 0) {
            System.out.println(real);
        } else if (real == 0) {
            System.out.println(imaginer + "i");
        } else if (imaginer < 0) {
            System.out.println(real + "-" + (-imaginer) + "i");
        } else {
            System.out.println(real + "+" + imaginer + "i");
        }
    }
}
