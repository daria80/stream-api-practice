package lambda;

public class Main {

    public static void main(String[] args) {

        Summable<Integer> summable1 = new Summable<Integer>() {
            @Override
            public Integer sum(Integer a, Integer b) {
                return a+b;
            }
        };

        Summable<Integer> s2 = (a, b) -> a - b;

        System.out.println(s2.sum(3,6)); // 9

        Summable<Integer> s3 = new Calc():: sum;
        Summable<Integer> s4 = Calc::sub;

        Substractable<Integer> s5 = Calc::new;

        Displayable<String> output = (x) -> System.out.println(x);
    }
}
