import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPISample3 {
    
    public static void main(String[] args){

        /**
         * 中間操作のサンプル
         * 時間ないのでちょっとだけ
         */

         //iterateで無限Streamして、limitで上限決めちゃう
         //IntStream stream1 = IntStream.iterate(1, n -> n + 1);
         //stream1.limit(10L).forEach(x -> System.out.print(x + " "));

         //Stream作って、skipで切り捨てちゃう
         IntStream stream2 = IntStream.rangeClosed(1, 100);
         stream2.skip(20L).limit(5L).forEach(x2 -> System.out.print(x2 + " "));

         Stream.generate(() -> "Java").limit(5L).forEach(x2 -> System.out.print(x2 + " "));

         Stream.of("bb", "aa", "cc").map(x -> x.toUpperCase()).forEach(x2 -> System.out.print(x2 + " "));

    }
}
