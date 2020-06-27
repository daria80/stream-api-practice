package method.types;

public interface Types {

    // consumer -  только принимает
    void consumer(Object... data);

    // supplier - только возвращает
    int supplier();

    // predicate - принимает любой тип, а возвращает boolean
    boolean predicate(Object... a);

    // function - принимает и возвращает
    Object function(Object... data);

}
