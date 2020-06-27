import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Collection<Integer> c = new ArrayList<>();
        Collection<Integer> d = new ArrayDeque<>();

        // 1. intermediate operations - промежуточные, конвеерные
        // .map
        // .filter
        // .sorted

        // 2. terminate operations - завершающие
        // .collect
        // .forEach
        // .max
        // .min
        // .reduce


        // List<Double> doubles = new ArrayList<>();
        double result = Stream.of(1,2,3,4,5,6,7,8)
                .filter(x -> x % 2 == 0)   // [2, 4, 6, 8]
                .map(Double::valueOf)// [2.0, 4.0, 6.0, 8.0]
                .limit(3)// [2.0, 4.0, 6.0]
                .skip(1)// [4.0, 6.0]

                .reduce(0.0, (a,b) -> a + b ); // [10.0]

        System.out.println(result);
//                .forEach(System.out::println);// ленивая операция
//                .map(new Function<Integer, Object>() {
//                    @Override
//                    public Object apply (Integer x) {
//                        return Double.valueOf(x);
//                    }
//                })
//                .map(x -> {
//                    doubles.add(Double.valueOf(x));
//                    return  Double.valueOf(x);
//                })

        // .forEach( x -> System.out.println(x));

//        Stream.of(1,2,3,4,5,6,7,8).filter(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer x) {
//                return x % 2 == 0;
//            }
//        });

        // System.out.println(Arrays.toString(doubles.toArray()));

        int result1 = Stream.of(1,2,3,4,5,6,7,8)
                .max(Comparator.comparingInt(o -> o))
                .get();


    }
}
