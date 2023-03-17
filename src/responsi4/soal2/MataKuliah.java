package responsi4.soal2;

public class MataKuliah implements Comparable<MataKuliah> {
    private final float rating;
    private final String nama;
    private final int kodeJurusan;
    private final int tahunPengambilan;

    public MataKuliah(String nama, int kodeJurusan, int tahunPengambilan, float rating) {
        this.nama = nama;
        this.kodeJurusan = kodeJurusan;
        this.tahunPengambilan = tahunPengambilan;
        this.rating = rating;
    }

    public float getRating() {
        return rating;
    }

    public String getNama() {
        return nama;
    }

    public int getKodeJurusan() {
        return kodeJurusan;
    }

    public int getTahunPengambilan() {
        return tahunPengambilan;
    }

    @Override
    public int compareTo(MataKuliah o) {
        if (this.kodeJurusan == o.kodeJurusan) {
            if (this.tahunPengambilan == o.tahunPengambilan) {
                return Float.compare(this.rating, o.rating);
            } else {
                if (this.tahunPengambilan > o.tahunPengambilan) {
                    return 1;
                } else {
                    return -1;
                }
            }
        } else {
            if (this.kodeJurusan > o.kodeJurusan) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
