import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        Optional<Integer> num = Optional.empty();

        System.out.println(num.orElse((0)));  // if empty = 0
        System.out.println(num.orElseGet(() -> 0));

        num.orElseThrow(RuntimeException::new);

        num.ifPresent(System.out::println);

        if (num.isPresent()) System.out.println(0);

    }
}
