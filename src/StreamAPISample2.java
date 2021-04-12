import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPISample2 {
    
    public static void main(String[] args){

        /**
         * 終端操作を色々試してみる
         */

         //まずは配列の用意
         List<Integer> list = Arrays.asList(1, 3, 5, 4);

         //Mach系の終端操作
         boolean result1 = list.stream().allMatch(i -> i > 2);
         boolean result2 = list.stream().anyMatch(i -> i > 2);
         boolean result3 = list.stream().noneMatch(i -> i > 2);

         System.out.println(result1);
         System.out.println(result2);
         System.out.println(result3);

         /**
          * count() forEach()
          */
          List<String> list2 = Arrays.asList("aa", "cc", "bb");

          long size = list2.stream().count();
          System.out.println(size);

          list2.stream().forEach(System.out::print);
          System.out.println();

          /**
           * reduce()
           */
          IntStream intStream1 = IntStream.of(4, 5, 6);
          int result4 = intStream1.reduce(0, (a, b) -> a + b);
          System.out.println(result4);

          //reduce()の結果をOptionalで受けとることも可能
          BinaryOperator<Integer> operator = (a, b) -> a + b;
          Stream<Integer> stream = Stream.of(10, 20, 30);

          //初期値を設定しない
          Optional<Integer> result5 = stream.reduce(operator);
          result5.ifPresent(System.out::print);
          System.out.println();

          Stream<Integer> stream2 = Stream.empty();
          Optional<Integer> result6 = stream2.reduce(operator);
          System.out.println(result6);
          result6.ifPresent(System.out::print);

          /**
           * toArray() メソッド
           */
          int[] arry1 = IntStream.range(1, 6).toArray();

          /**
           * max(),min()も同じ感じで実装できる
           */
        List<String> data1 = Arrays.asList("aaa", "bb", "c");
        Optional<String> result7 = data1.stream().max(Comparator.naturalOrder());
        result7.ifPresent(System.out::println);

        //もしくは。。
        Optional<String> result8 = data1.stream().max((s1, s2) -> s1.length() - s2.length());
        result8.ifPresent(System.out::println);

        /**
         * findFirst(), findAny()
         */
        //→max(), min()と扱い方は同じ

        Stream<Double> stream3 = Stream.empty();
        Optional<Double> result9 = stream3.findFirst();

        System.out.println(result9.orElse(0.0));
        System.out.println(result9.orElseGet(() -> Math.random()));
        System.out.println(result9.orElseThrow(() -> new IllegalArgumentException()));



    }
}
