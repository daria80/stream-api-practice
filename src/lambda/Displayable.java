package lambda;

@FunctionalInterface
public interface Displayable<T> {

    void display(T data);

}
