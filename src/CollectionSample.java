import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionSample {

    public static void main(String[] args){

        /**
         * List(ArrayList)
         * 格納する要素に順序づけができる
         */
        ArrayList<Integer> list = new ArrayList<>();

        //変数宣言
        Integer i1 = 1;
        int i2 = 2;
        Integer i3 = i1;

        //要素(element)の追加
        list.add(i1);
        list.add(i2); //integer型に変換される
        list.add(i3); //重複要素
        list.add(1, 5); //インデックス１番目に格納(インデックスは0番目が先頭)
        list.add(1, 7);
        list.add(1, 8);

        //格納している要素の確認
        System.out.println("size : " + list.size());
        System.out.print("Elements : ");
        for(Integer i : list){
            System.out.print(i + " ");
        }
        System.out.println();

        //要素検索
        System.out.println(i1 + " : " + list.contains(i1));
        System.out.println("2 : " + list.contains(2));
        System.out.println("9 : " + list.contains(9));
        System.out.println("10 : " + list.contains(10));

        //さらに要素検索
        List<Integer> checklist1 = Arrays.asList(1,2,5,7,8);
        List<Integer> checklist2 = Arrays.asList(5,7,8,11);
        System.out.println("checklist1 : " + list.containsAll(checklist1));
        System.out.println("checklist2 : " + list.containsAll(checklist2));

        //さらに検索
        System.out.println("isEmpty : " + list.isEmpty());

        //要素を全消し
        list.clear();

        //格納している要素の確認
        System.out.println("size : " + list.size());
        for(Integer i : list){
            System.out.print(i + " ");
        }

        //さらに検索
        System.out.println("isEmpty : " + list.isEmpty());

        //配列取得
        //Integer[] integers = (Integer[]) list.toArray();

        /**
         * Set(HashSet, TreeSet)
         * 要素のダブりがない
         */
        String[] ary = {"CCC", "AAA", "BBB"};

        //HashSet
        HashSet<String> hashSet = new HashSet<>();

        //要素の追加
        hashSet.add(ary[0]);
        hashSet.add(ary[1]);
        hashSet.add(ary[2]);
        hashSet.add(ary[0]);

        //要素数の確認
        System.out.println("HashSet size : " + hashSet.size());

        //要素の確認
        for(String str : hashSet) System.out.print(str + " ");
        System.out.println("");
        /**
         * AAA CCC BBB 
         * →HashSetはソートされない
         */

        //TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        //要素の追加
        treeSet.add(ary[0]);
        treeSet.add(ary[1]);
        treeSet.add(ary[2]);
        treeSet.add(ary[0]);

        //要素数の確認
        System.out.println("TreeSet size : " + treeSet.size());

        //要素の確認
        for(String str : treeSet) System.out.print(str + " ");
        System.out.println("");
        /**
         * AAA BBB CCC
         * →TreeSetはソートされる 
         */
        
        /**
         * ちょっと脱線
         * Iterator
         */
        Iterator<String> iter = treeSet.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
        System.out.println("");

        Iterator<String> iter2 = hashSet.iterator();
        while(iter2.hasNext()){
            System.out.print(iter2.next() + " ");
        }
        System.out.println("");

        /**
         * Map
         */
        
        //Map
        Map<Integer, String> map = new TreeMap<>();

        //要素の格納
        map.put(1, "A");
        map.put(2, "B");

        //要素の確認
        System.out.println(map.size());
        System.out.println(map);

        /**
         * Queue
         */

         //Queue
        Queue<String> queue = new ArrayDeque<>();

        //offerで要素追加(addでも行けるよ)
        queue.offer("1");
        queue.offer("2");
        queue.offer("3");
        queue.add("4");

        //要素の確認・操作
        System.out.println(queue);
        System.out.println("peek() : " + queue.peek());
        System.out.println(queue);
        System.out.println("remove() : " + queue.remove());
        System.out.println(queue);
        System.out.println("poll() : " + queue.poll());
        System.out.println(queue);

        /**
         * Comparableインタフェース
         * Comparatorインタフェース
         */
        
        //下記のEmployeeとMyRoleを使用し、Comparebleを使ってみる
        Employee e1 = new CollectionSample().new Employee("taro", 20);
        Employee e2 = new CollectionSample(). new Employee("tomoko", 10);
        Employee e3 = new CollectionSample(). new Employee("hiromi", 50);

        //Listに格納
        ArrayList<Employee> list3 = new ArrayList<>();
        list3.add(e1);
        list3.add(e2);
        list3.add(e3);

        //要素の確認
        System.out.println("ソート前");
        for(Employee e : list3){
            System.out.println(e.getId() + " : " + e.getName());
        }

        //MyRuleに従ってソートする
        /**
         * Collectionsクラスのsortメソッド使う
         */
        Collections.sort(list3, new CollectionSample().new MyRule());

        //要素の確認
        System.out.println("ソート後");
        for(Employee e : list3){
            System.out.println(e.getId() + " : " + e.getName());
        }

        /**
         * Collectionクラスで遊んでみる
         */
        System.out.println("/**");
        System.out.println(" * Collectionクラスで遊んでみる");
        System.out.println(" */");

        //コレクション作成
        List<Animal> list4 = new ArrayList<>();

        //要素の追加
        list4.add(new CollectionSample.Animal(130, "うさぎ"));
        list4.add(new CollectionSample.Animal(30, "人間"));
        list4.add(new CollectionSample.Animal(5, "かめ"));
        list4.add(new CollectionSample.Animal(90, "狐"));
        list4.add(new CollectionSample.Animal(45, "ゴリラ"));

        //要素の確認
        System.out.println("------整列前------");
        for(Animal a : list4){
            System.out.println(a.getSeed() + " : " + a.getSpeed());
        }

        //ソート(CompalableI/Fで実装したメソッドcompareToでソートする)
        System.out.println("------整列(Comparable)------");
        Collections.sort(list4, new SpeedCheckRule());
        for(Animal a : list4){
            System.out.println(a.getSeed() + " : " + a.getSpeed());
        }

        //reverse
        System.out.println("------逆順に並び替え------");
        Collections.reverse(list4);
        for(Animal a : list4){
            System.out.println(a.getSeed() + " : " + a.getSpeed());
        }

        /**
         * Arraysクラスで遊んでみる
         */
        System.out.println("/**");
        System.out.println(" * Arraysクラスで遊んでみる");
        System.out.println(" */");

        //まずはArraysで配列をリストにしてみる
        Integer[] integers = {3, 1, 2};
        List<Integer> list5 = Arrays.asList(integers);

        System.out.println("------配列をリスト化------");
        for(Integer i : list5){
            System.out.print(i);
        }
        System.out.println();

        //配列をソートする
        Arrays.sort(integers);
        System.out.println("------配列をソート-----");
        for(Integer i : list5){
            System.out.print(i);
        }
        System.out.println();


    }

    //Comparator用サンプルクラス
    public class Employee {
        private String name;
        private Integer id;
        
        public Employee (String name, Integer id) {
            this.name = name;
            this.id = id;
        }

        public Integer getId(){return id;};
        public String getName(){return name;}
    }

    //こんな感じで、Comparatorを使用して比較メソッド実装クラスを作成できる
    public class MyRule implements Comparator<Employee>{
        @Override
        public int compare(CollectionSample.Employee o1, CollectionSample.Employee o2) {
            return o1.getId().compareTo(o2.getId());//結局、Integer型の比較メソッドを使用
        }
    }

    //遊び用クラス
    public static class Animal implements Comparable<CollectionSample.Animal>{

        //フィールド
        private int speed;
        private String seed;

        //コンストラクタ
        Animal (int i, String str){
            this.speed = i;
            this.seed = str;
        }

        //getter
        public int getSpeed() {return speed;}
        public String getSeed() {return seed;}

        //比較メソッド
        @Override
        public int compareTo(Animal animal) {
            //speedが早いなら、正を、遅いなら負を、同じなら0を
            if(this.speed > animal.getSpeed()) return -1;
            else if(this.speed < animal.getSpeed()) return 1;
            else return 0;
        }
        
    }

    //比較クラス
    public static class SpeedCheckRule implements Comparator<Animal>{

        @Override
        public int compare(Animal o1, Animal o2) {
            //speedが早いなら、正を、遅いなら負を、同じなら0を
            return o1.compareTo(o2);
        }
    }
}
