import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.function.Consumer;

/**
 * メソッド参照学習クラス
 */
public class Sansho {
    
    /**
     * コンストラクタ参照
     */
    Supplier<ArrayList<Integer>> supplier = ArrayList::new;

    /**
     * クラス名(インスタンス名)::メソッド名
     */
    public void testMethod2 (){
        //参照メソッドで呼び出す
        test().forEach(this :: myPrint);
        //ラムダ式で呼び出す
        test().forEach((String x) -> myPrint(x));
        //↓引数の型がConsumerなので、エラー出る(引数あり、戻り値なし)
        //sansho.test().forEach(() -> sansho.myPrint());
        Consumer<String> consumer = str -> System.out.println(str);
        test().forEach(consumer);

        //メソッド参照の場合
        Consumer<String> consumer2 = System.out::println;
        test().forEach(consumer2);
    } 

    /**
     * testメソッド
     */
    void testMethod(){
        System.out.println("testMethod");
    }

    public List<String> test(){
        List<String> list = new ArrayList<>();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("DD");
        return list;
    }

    public void myPrint(String str){
        System.out.println(str);
    }

    public void myPrint(){
        System.out.println("引数なし");
    }
}
