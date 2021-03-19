import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * FunctionInterface学習用クラス
 */
public class FunctionalInterfaceText {

    public static void main(String[] args){
    /**
     * Functional<T,R> 引数、戻り値
     * BiFunction<T,U,R> 引数２、戻り値
     * メソッドはapply
    */
    Function<String, Integer> apply1 = str1 -> 100;
    BiFunction<String, Integer, String> apply2 = (str2, i) -> "100";

    Integer i1 = apply1.apply("Java");
    System.out.println(i1);

    String str3 = apply2.apply("java", 100);
    System.out.println(str3);

    /**
     * Consumer<T>　引数
     * BiConsumer<T,R> 引数２
     * メソッドは、accept
     */
    Consumer<String> accept1 = i2 -> System.out.println("Java");
    BiConsumer<String, Integer> accept2 = (String str4, Integer i3) -> System.out.println("Java");

    accept1.accept("Java");
    accept2.accept("Java", 10);

    /**
     * Supplier<T> 戻り値
     * メソッドはget
     */
    Supplier<String> get1 = () -> {return "Java";};

    System.out.println(get1.get());

    /**
     * Predicate<T> 引数
     * メソッドは、test 
     */
    Predicate<Integer> test1 = (i4) -> {return i4 > 100;};

    if(test1.test(101)){
        System.out.println("ちゃんとラムダ式動きました");
    }

    /**
     * UnaryOperator<T> 引数、戻り値
     * BinaryOperator<T> 引数2、戻り値
     * メソッドは、apply
     */
    UnaryOperator<String> apply3 = (str5) -> {return "Gold";};
    BinaryOperator<Integer> apply4 = (i5, i6) -> 7;

    System.out.println(apply3.apply("Java"));
    System.out.println(apply4.apply(4,5));

    }
}