package lambda;

//1.5 Generics
@FunctionalInterface //один единственный абстрактный метод
public interface Summable<T> {

    //since 1.2 Collections

    // constants
    // abstract methods
    T sum(T a, T b);

    // constant
    int min = 0;


    //since 1.8
    // abstract methods
    // default methods

    default double sum2(int a, int b) {
        return a + b;
    }
    // static methods

    static double sum2(double a, double b) {
        return a - b;
    }
    // constants

}

