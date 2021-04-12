# JavaGold学習用

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

## Dependency Management

The `JAVA DEPENDENCIES` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-pack/blob/master/release-notes/v0.9.0.md#work-with-jar-files-directly).

## Review exam topics

### Java クラスの設計

* カプセル化を実装する  
* アクセス修飾子やコンポジションを含む継承を実装する
* ポリモーフィズムを実装する
* オブジェクト・クラスの hashCode、equals および toString メソッドをオーバーライドする
* シングルトン・クラスと不変クラスを作成および使用する
* 初期化ブロック、変数、メソッドおよびクラスでキーワード static を使用する

### 高度な Java クラスの設計

* 抽象クラスおよびメソッドを使用するコードを作成する
* キーワード final を使用するコードを作成する
* 静的な内部クラス、ローカル・クラス、ネストしたクラス、無名内部クラスなどの内部クラスを作成する
* メソッドやコンストラクタが列挙型内にあるものを含めて、列挙型を使用する。
* インタフェースを宣言、実装、拡張するコードを作成する。@Override 注釈を使用する
* ラムダ式を作成および使用する

### ジェネリクスとコレクション

* ジェネリクスクラスを作成および使用する
* ArrayList、TreeSet、TreeMap および ArrayDeque オブジェクトを作成および使用する
* java.util.Comparator およびjava.lang.Comparable インタフェースを使用する

### コレクション、ストリームおよびフィルタ

* コレクション、ストリームおよびフィルタ
* ストリームのインタフェースとパイプラインについて説明する
* ラムダ式を使用してコレクションをフィルタリングする
* ストリームとともにメソッド参照を使用する

### ラムダ組込み関数型インタフェース

* Predicate、Consumer、Function、Supplier など、java.util.function パッケージに含まれている組込みインタフェースを使用する
* プリミティブ型を扱う関数型インタフェースを使用する
* 2つの引数を扱う関数型インタフェースを使用する
* UnaryOperator インタフェースを使用するコードを作成する

### Java ストリーム API

* 基本バージョンの map() メソッドを含む peek() および map() メソッドを使用してオブジェクトからデータを抽出する
* findFirst、findAny、anyMatch、allMatch、noneMatch などの検索メソッドを使用してデータを検索する
* Optional クラスを使用する
* ストリームのデータ・メソッドと計算メソッドを使用するコードを作成する
* ストリーム API を使用してコレクションをソートする
* collect メソッドを使用してコレクションに結果を保存する。Collectors クラスを使用してデータをグループ化/パーティション化する
* flatMap() メソッドを使用する

### 例外とアサーション

* try-catch および throw 文を使用する
* catch、multi-catch および finally 句を使用する
* try-with-resources 文とともにAutoclose リソースを使用する
* カスタムな例外と自動クローズ可能なリソースを作成する
* アサーションを使用して不変量をテストする

### Java SE 8 の日付/時刻 API を使用する

* LocalDate、LocalTime、LocalDateTime、Instant、Period および Duration を使用して日付と時刻を単一オブジェクトに結合するなど、日付に基づくイベントと時刻に基づくイベントを作成および管理する
* 複数のタイムゾーン間で日付と時刻を操作する。日付と時刻の値の書式設定など、夏時間による変更を管理する
* Instant、Period、Duration および TemporalUnit を使用して、日付に基づくイベントと時刻に基づくイベントを定義、作成および管理する

### Java の I/O の基本

* コンソールに対してデータの読取り/書込みを行う
* java.iopackage の BufferedReader、BufferedWriter、File、FileReader、FileWriter、FileInputStream、FileOutputStream、ObjectOutputStream、ObjectInputStream および PrintWriter を使用する

### Java のファイル I/O（NIO.2）

* Path インタフェースを使用してファイルおよびディレクトリ・パスを操作する
* カプセル化を実装する
* NIO.2 とともにストリーム API を使用する

### Java の同時実行性

* Runnable と Callable を使用してワーカー・スレッドを作成する。 ExecutorService を使用してタスクを同時に実行する
* スレッド化の潜在的な問題であるデッドロック、スタベーション、ライブロックおよび競合状態を識別する
* キーワード synchronized と java.util.concurrent.atomic パッケージを使用してスレッドの実行順序を制御する
* CyclicBarrier や CopyOnWriteArrayList など、java.util.concurrent のコレクションとクラスを使用する
* 並列 Fork/Join フレームワークを使用する
* リダクション、分解、マージ・プロセス、パイプライン、パフォーマンスなど、並列ストリームを使用する

### JDBC によるデータベース・アプリケーションの作成

* Driver、Connection、Statement および ResultSet インタフェースと、プロバイダの実装に対するこれらの関係など、JDBC API の中核を構成するインタフェースについて説明する
* JDBC URLなど、DriverManager クラスを使用してデータベースに接続するために必要なコンポーネントを識別する
* ステートメントの作成、結果セットの取得、結果の反復、結果セット/ステートメント/接続の適切なクローズを含め、問合せを発行しデータベースから結果を読み込む

### ローカライズ

* アプリケーションをローカライズするメリットについて説明する
* Locale オブジェクトを使用してロケールを読み取り設定する
* Properties ファイルの作成と読取りを行う
* 各ロケールについてリソース・バンドルを作成し、アプリケーションでリソース・バンドルをロードする

### 【出題に関する注意事項】

* package および import 文の欠落:  
  サンプルコードに package および import 文が記載されておらず、設問にも明示的に指示が行われていない場合は、すべてのサンプルコードは同一パッ ケージ内に存在する、あるいは適切なインポートが行われているものとします。
* クラスが定義されるソース・ファイル名やディレクトリ・パス名の欠落:  
  設問内にソース・ファイル名やディレクトリの場所が指定されていない場合は、コードのコンパイルおよび実 行を可能にするため、次のいずれかを想定しています。  
  すべてのクラスは、1つのソース・ファイル内に存在する。  
  各クラスは異なるソース・ファイルに格納されており、すべてのファイルは同一ディレクトリ内に存在する。  
* 意図しない改行:  
  サンプルコード内に、意図しない所で改行されているコードが存在する場合があります。行が折り返されたように見えるコードがあった場合、例えば、引用符で囲まれた文字列リテラルの途中で改行されているような場 合、折り返されたコードは改行前のコードの延長であると仮定し、コードにはコンパイル･エラーの原因とな る改行は含まれていないものと想定します。  
* コード断片:
  コード断片は、ソースコードの一部を表示したものです。完全なコードを省略表示したものであり、コードの コンパイルと実行が問題なく行える環境が整っていると想定します。  
* コメント中の説明:
  「setter メソッドおよび getter メソッドをここに記述」などの説明コメントは、文字通りに解釈してくだ さい。説明コメントにあるコードが存在し、コンパイルおよび実行が問題なく行わえるものと想定します。  
