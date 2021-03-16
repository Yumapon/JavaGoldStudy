@FunctionalInterface
public interface FunctionalInterSample {

    //抽象メソッドは１つ
    void run () throws Exception;

    @Override
    String toString();

    @Override
    int hashCode();

    @Override
    boolean equals(Object obj);

}
