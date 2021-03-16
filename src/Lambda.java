import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//Lambda式学習用クラス
public class Lambda {

    //一般的な使い方(FunctionalInterface呼び出し)
    //@FunctionalInterface
    //public interface Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see     java.lang.Thread#run()
     */
    //public abstract void run();
    //}
    Runnable runner = () -> { System.out.println("Hello Lambda!"); };
    public void sample(){
      runner.run();
    }

    //Lambda式の成り立ち
    /**
    * Localクラスで実装する
    */
    class Local implements Runnable {
        @Override
        public void run() {
          System.out.println("Hello Lambda!");
        }
      }
    
      public void local(){
        Runnable runner = new Local();
        runner.run(); // Hello Lambda!
      }
    
    /**
    * 匿名クラスで実装する
    */

    public void tokumei(){
      Runnable runnable = new Runnable(){
        @Override
        public void run(){
          System.out.println("Hello Lambda!");
        }
      };

      runnable.run();
    }

    /**
     * 匿名クラスから色々省略する
     * ①インターフェースの型で匿名インスタンス作るので、型いらない(new Runnable)
     * ②メソッドは、クラスがFunctionalインターフェースなので、指定要らず、中身だけで良い(run()あたり)
     */
    public void lambda(){
      Runnable runnable = () -> {System.out.println("Hello Lambda!");};
      runnable.run();
    }

    /**
     * 型推論を使って、メソッドにLambda式を渡すことができる
     * その１
     */
    public void methodtest(){
      method(() -> {System.out.println("Hello Lambda!");});
    }

    /**
     * 型推論を使って、メソッドにLambda式を渡すことができる
     * その２
     * @param r
     */
    public void method(Runnable r){
      r.run();
    }

    /**
     * Function<T,R>
     * 戻り値、引数ありのFunctionaInterface
     */
    public void functiontest(){
      Function<Integer, String> asterisker = (i) -> { return "*"+ i; };
      String str = asterisker.apply(5);
      System.out.println(str);
    }

    /**
     * BiFunction<T,U,R>
     * 引数２つ、戻り値ありのFunctionalInterface
     */
    public void bifunctiontest(){
      BiFunction<Integer, Integer, Integer> adder = (x, y) -> {return x + y;};
      int i = adder.apply(1, 2); 
      System.out.println(i);
    }

    /**
     * Consumer<T>
     * 引数１、戻り値なし
     */
    public void consumertest(){
      Consumer<String> buyer = (goods) -> {System.out.println(goods + "を購入しました");};
      buyer.accept("おにぎり");
    }

    /**
     * 当然これもBiConsumer<T,U>
     * 引数２、戻り値なしとかがある
     */
    public void biconsumertest(){
      BiConsumer<String, Integer> buyer2 = (goods, i) -> {System.out.println(goods + "を" + i + "個購入しました");};
      buyer2.accept("おにぎり", 4);
    }

    /**
     * Predicate<T>
     * 引数1 戻り値boolean
     */
    public void predicatetest(){
      Predicate<Integer> checker = (i) -> {return i > 5;};
      boolean result = checker.test(4);
      System.out.println(result);
    }

    /**
     * Lambda式の省略！
     */
    //基本形
    Predicate<String> check = (String str) -> {return str.equals("Java");};

    /**
     * 引数の型を省略
     */
    Predicate<String> check2 = (str) -> {return str.equals("Java");};

    //引数が複数ある場合、片方省略は無理
    //BiConsumer<Integer, String> test = (i, String s) -> {return i + s;};
    BiConsumer<Integer, String> test = (Integer i, String s) -> { System.out.println(s + i); };
    BiConsumer<Integer, String> test2 = (i, s) -> { System.out.println(s + i); };

    /**
     * 引数の()を省略
     */
    Function<String, Integer> test3 = s -> {return 1;};
    
    //引数が複数個ある場合及び型指定していない場合、引数の()は省略不可
    //BiFunction<Integer,String,Integer> test4 = i, s -> {return 1;}; エラー()が必要
    //Function<Integer,Integer> test4 = Integer i -> {return 1;}; エラー()が必要
    Function<Integer,Integer> test4 = (Integer i) -> {return 1;};
    BiFunction<Integer,String,Integer> test5 = (i, s) -> {return 1;};

    //引数ない場合
    Supplier<String> sup = () -> "アイウエオ";
    Supplier<String> sup2 =  () -> {return "アイウエオ";};
    //()ないのは無理
    //Supplier<String> sup3 =  -> "アイウエオ";

    /**
     * 処理の{}を省略
     */
    Predicate<Integer> check3 = i -> i > 4;

    //returnを記述する場合、{}は省略不可
    //Predicate<Integer> check4 = i -> return i > 4;エラー
    Predicate<Integer> check4 = i -> {return i > 4;};

    //処理が２文以上あっても{}省略不可
    //Predicate<Integer> check5 = i -> String str = "wow";
    //                                  return str.length() > i; エラー

    Predicate<Integer> check5 = i -> {
                                      String str = "wow";
                                      return str.length() > i;
                                     };

  //return省略だけは無理。{}つけるか、{}省略するか
  //Predicate<String> check6 = s -> {s.equals("java");}; エラー
  Predicate<String> check6 = s -> {return s.equals("java");};
  Predicate<String> check7 = s -> s.equals("java");
}
