package responsi5.soal3;

import java.util.List;

public class Pasukan {
    private List<Integer> list;
    private final int n;

    public Pasukan(List<Integer> list, int n) {
        this.list = list;
        this.n = n;
    }

    public void reset() {
        list.clear();
        for (int i = 0; i < n; i++) {
            list.add(0);
        }
    }

    public long get(int idx) {
        this.reset();
        long start = Util.getTime();
        list.get(idx);
        return Util.getTime() - start;
    }

    public long del(int idx, int t) {
        this.reset();
        long start = Util.getTime();
        for (int i = 0; i < t; i++) {
            list.remove(idx);
        }
        return Util.getTime() - start;
    }
}
