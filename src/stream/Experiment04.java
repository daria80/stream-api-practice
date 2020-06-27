package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Experiment04 {

    public static void main(String[] args) {

        List<Integer> l = Stream.of(1, 3, 65, 100, 25, 2).collect(Collectors.toList());
        l.addAll(Arrays.asList(92, 2, 5, 32, 6));
        int limit = l.size() / 2 + Math.min(l.size() % 2, 1);


        List<Integer> result = Stream.iterate(0, e -> e + 2) // [0, 2, 4, 6, 8, 10, 12]
                .limit(limit)
                .map(x -> l.get(x) * l.get(x))
                .collect(Collectors.toList());

        System.out.println(result);



        // добавить в список числа
        // вывести числа через одно
        // возвести каждое в квадрат


    }
}
