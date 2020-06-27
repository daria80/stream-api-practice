package stream;

import java.util.ArrayList;
import java.util.Collection;

public class Experiment02 {

    public static void main(String[] args) {

        Collection<Integer> a = new ArrayList<>();
        a.add(100);
        a.add(43);
        a.add(43);
        a.add(52);
        a.add(52);
        a.add(43);

        //нужно найти в списке количество уникальных элементов

        System.out.println(a.stream().distinct().count());

    }
}
