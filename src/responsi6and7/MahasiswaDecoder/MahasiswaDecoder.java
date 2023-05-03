import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MahasiswaDecoder {
    private Mahasiswa mahasiswa;

    MahasiswaDecoder(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public void addMatkul(String name) throws Exception {
        Method method = mahasiswa.getClass().getDeclaredMethod("addMatkul", String.class);
        method.setAccessible(true);
        method.invoke(mahasiswa, name);
    }

    public int getNIM() throws Exception {
        Field field = mahasiswa.getClass().getDeclaredField("NIM");
        field.setAccessible(true);
        return field.getInt(mahasiswa);
    }

    public double getIPK() throws Exception {
        Field field = mahasiswa.getClass().getDeclaredField("IPK");
        field.setAccessible(true);
        return field.getDouble(mahasiswa);
    }
}
