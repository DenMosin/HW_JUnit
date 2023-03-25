import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));

    public static void main(String[] args) {
        StreamMain.stream(list);
        System.out.println(StreamMain.filtr(list));
        System.out.println(StreamMain.summ(list));
    }

}
