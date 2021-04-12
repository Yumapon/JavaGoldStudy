import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPISample {

    public static void main(String[] args){
        /**
        * ちょっとStreamAPI触ってみる
        */
        //まずはデータソースの用意
        List<String> list = Arrays.asList("bb", "aa", "cc");

        //StreamAPIで色々操作
        list.stream().sorted().map(s -> s.toUpperCase()).forEach(
                               s -> System.out.print(s + " "));

        /**
        * Stream<E>等の生成
        */

        //Collectionインタフェースのメソッドで生成してみる(いつものやつ)
        Stream<Integer> stream2 = Arrays.asList(1, 4, 6).stream();

        //Arraysクラスでも作れる
        String[] array = {"bb", "aa", "cc"};
        Stream<String> stream3 = Arrays.stream(array);

        int[] ints = {2, 3, 1};
        IntStream stream4 = Arrays.stream(ints);

        //Streamインタフェースでも当然作成できる
        String[] array2 = {"ee", "gg", "ff"};
        Stream<String> stream5 = Stream.of(array2);

        //Streamインタフェースでは、こんな感じでも行ける
        Stream<String> stream6 = Stream.of("bb", "aa", "cc");

        //さらにこんなのも
        Stream<Object> stream7 = Stream.empty();

        //Supplier使ってもいけちゃう
        Supplier<String[]> get = () -> {
            String[] arrays = {"cc", "bb", "aa"};
            return arrays;
        };
        Stream<String[]> stream8 = Stream.generate(get);

        //よーわからんけどこんなんも
        //1から４の数値でStreamを作成する
        IntStream stream9 = IntStream.range(1, 5);

        //1から5の数値のStreamを作成する
        IntStream stream10 = IntStream.rangeClosed(1, 5);
    }
}
