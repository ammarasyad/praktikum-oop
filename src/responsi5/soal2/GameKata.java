package responsi5.soal2;

import java.util.Arrays;
import java.util.HashMap;

public class GameKata {
    public static void run(String[] tito, String[] wiwid) {
        HashMap<String, Integer> map = new HashMap<>();
        Arrays.stream(tito).forEach(s -> map.put(s, 1));
        Arrays.stream(wiwid).filter(map::containsKey).distinct().forEach(System.out::println);
    }
}
