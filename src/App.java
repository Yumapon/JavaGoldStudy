//import java.util.ArrayList;
//import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        //メソッド参照
        //Sansho sansho = new Sansho();
        //sansho.testMethod2();

        //StreamAPIでLambda式を理解してみる
        //List<String> list = new ArrayList<>();

        //list.add("Apple");
        //list.add("Banana");
        //list.add("Cherry");

        //list.forEach(s -> System.out.println(s));

        //list.clear();

        //list.add("1");
        //list.add("2");
        //list.add("3");

        //System.out.println(list);

        //int sum = list.stream()
        //        .mapToInt(s -> Integer.parseInt(s))
        //        .sum();
                
        //System.out.println(sum);

        //列挙型のテスト
        System.out.println("-------EnumのTEST---------");
        Enumtest enumtest1 = Enumtest.TEST1;//これでインスタンスもらえる
        System.out.println("enumtest1.getA()");
        System.out.println(enumtest1.getA());

        Enumtest enumtest2 = Enumtest.TEST3;
        System.out.println("enumtest2.getA()");
        System.out.println(enumtest2.getA());

        System.out.println("------enumtest1------");

        System.out.println("enumtest1.name()");
        System.out.println("enum定数名");
        System.out.println(enumtest1.name());

        System.out.println("enumtest1.toString()");
        System.out.println("enum定数名");
        System.out.println(enumtest1.toString());

        System.out.println("enumtest1.ordinal()");
        System.out.println("enum宣言の位置");
        System.out.println(enumtest1.ordinal());

        System.out.println("enumtest1.compareTo(enumtest2)");
        System.out.println(enumtest1.compareTo(enumtest2));

        System.out.println("------enumtest2------");

        System.out.println("enumtest2.name()");
        System.out.println(enumtest2.name());

        System.out.println("enumtest2.ordinal()");
        System.out.println(enumtest2.ordinal());

        System.out.println("enumtest2.toString()");
        System.out.println(enumtest2.toString());

        System.out.println("------  valuesのテスト ------");
        for(Enumtest e : Enumtest.values()){
            System.out.println(e);
        }

        System.out.println("------  valueOfのテスト ------");
        System.out.println(Enumtest.valueOf("TEST1").getA());
        System.out.println(Enumtest.valueOf("TEST2").getA());
        System.out.println(Enumtest.valueOf("TEST3").getA());
    }

    //Enumのテスト
    public enum Enumtest {
        TEST1, TEST2, TEST3(4);

        //メンバ
        int a = 0;

        //コンストラクタ
        private Enumtest(){
            System.out.println("Enumのコンストラクタが動きました");
        }
        Enumtest(int a){
            System.out.println("Enumのコンストラクタが動きました");
            this.a = a;
        }

        //メソッド
        public int getA(){
            return a;
        }
    }
}
