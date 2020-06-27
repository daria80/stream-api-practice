package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Experiment03 {

    public static void main(String[] args) {

        List<Integer> l = Stream.of(1, 3, 65, 100, 25, 2).collect(Collectors.toList());
        l.addAll(Arrays.asList(92, 2, 5, 32, 6));

        for (int i=0; i<l.size(); i++) {
            if (i % 2 == 0)
        System.out.println(l.get(i));
        }

        for (int i=0; i<l.size(); i++) {
            if (i % 2 != 0)
                l.remove(i);
        }

        System.out.println(l.stream()
                .map(x -> x * x)
                .collect(Collectors.toList()));



        // добавить в список числа
        // вывести числа через одно
        // возвести каждое в квадрат


    }
}
