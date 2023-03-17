package responsi4.soal3;

public class TempatTinggal {
    private int luas;
    private double hargaBahanBangunan;

    public TempatTinggal(int luas, double hargaBahanBangunan) {
        this.luas = luas;
        this.hargaBahanBangunan = hargaBahanBangunan;
    }

    public int getLuas() {
        return luas;
    }

    public void setLuas(int luas) {
        this.luas = luas;
    }

    public double getHargaBahanBangunan() {
        return hargaBahanBangunan;
    }

    public void setHargaBahanBangunan(double hargaBahanBangunan) {
        this.hargaBahanBangunan = hargaBahanBangunan;
    }

    public double hitungBiayaBangun() {
        return luas * hargaBahanBangunan;
    }
}

class Rumah extends TempatTinggal {
    public Rumah(int luas, double hargaBahanBangunan) {
        super(luas, hargaBahanBangunan);
    }

    public Rumah(int lebar, int panjang, double hargaBangunan) {
        super(lebar * panjang, hargaBangunan);
    }

    @Override
    public void setLuas(int luas) {
        super.setLuas(luas);
    }

    public void setLuas(int lebar, int panjang) {
        super.setLuas(lebar * panjang);
    }

    @Override
    public double hitungBiayaBangun() {
        return super.hitungBiayaBangun();
    }

    public double hitungBiayaBangun(double biayaOrmas) {
        return super.hitungBiayaBangun() + biayaOrmas;
    }
}

interface Kendaraan {
    float hitungJarakTempuh();
}

class Karavan extends TempatTinggal implements Kendaraan {
    private float bensin;
    private float pemakaianBensin;

    public Karavan() {
        super(0, 0);
        this.bensin = 0;
        this.pemakaianBensin = 0;
    }

    public Karavan(int luas, double hargaBahanBangunan, float bensin, float pemakaianBensin) {
        super(luas, hargaBahanBangunan);
        this.bensin = bensin;
        this.pemakaianBensin = pemakaianBensin;
    }

    public float getBensin() {
        return bensin;
    }

    public void setBensin(float bensin) {
        this.bensin = bensin;
    }

    public float getPemakaianBensin() {
        return pemakaianBensin;
    }

    public void setPemakaianBensin(float pemakaianBensin) {
        this.pemakaianBensin = pemakaianBensin;
    }

    @Override
    public float hitungJarakTempuh() {
        return bensin * pemakaianBensin;
    }

    @Override
    public double hitungBiayaBangun() {
        return super.hitungBiayaBangun() * 3;
    }
}