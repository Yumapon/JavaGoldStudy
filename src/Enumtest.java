public enum Enumtest {
    /**
     * Enumは、単体のクラスファイルもしくはクラス定義の中でのみ宣言可能。
     * ※メソッド内では宣言できない。
     */
    
     SPADES, CLUBS, DIAMONDS, HEARTS
     /**
      * ↓上記はこんな感じのソースイメージ
      final class Enumtest extends java.lang.Enum<Enumtest> { ⇦自動でextendsされるので、他の型を継承できない。
        //コンストラクタ
        private Enumtest (){
          //privateのみOK
        }

        //メンバ
        public static final Enumtest SPADES;
        public static final Enumtest CLUBS;
        public static final Enumtest DIAMONDS;
        public static final Enumtest HEARTS;

        //自動追加のメソッド
        public static Enumtest[] values(){・・・};
        public static Enumtest valueOf(java.lang.String){・・・}

        static{}
      }
      */
}
