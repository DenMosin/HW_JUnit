import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {

    public static Object stream (List<Integer> list) {

        Stream<Integer> stream = list.stream();
        list.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 != 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);

        return null;
    }

    public static int summ (List<Integer> list){
        int s = 0;
        ArrayList<Integer> l = (ArrayList<Integer>) filtr(list);
        for (int i : l)
            s = s + i;
        return s;
    }

    public static List<Integer> filtr(List<Integer> list){
        list.removeIf(x -> x <= 0);
        list.removeIf(i -> i % 2 != 0);
        Collections.sort(list);

        //  System.out.println(list);
        return list;
    }
}