package stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class Experiment01 {

    public static void main(String[] args) {

        Collection<Integer> a = new ArrayList<>();
        a.add(100);
        a.add(43);
        a.add(10);
        a.add(52);
        a.add(80);
        a.add(9);

        //отсортировать
        //найти числа, которые делятся на 2
        //вывести первого из них

        System.out.println(a.stream()
                .sorted()
                .filter(x -> x % 2 == 0)
                .findFirst().get());
//                .min(Comparator.comparingInt(o -> o))
//                .get());
    }
}
