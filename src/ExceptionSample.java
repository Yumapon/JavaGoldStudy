import java.sql.SQLException;

public class ExceptionSample {

    public void main(String[] args){
    
    /**
     * throwableクラスの拡張機能
     */
    /*
    try(MyResource obj1 = new MyResource("obj1");
        MyResource obj2 = new MyResource("obj2");){
            obj1.method();
        } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
    } 
    */ 
    }
}


/**
* throwableクラスの拡張機能検証用クラス
*/
/*
class MyResource implements AutoCloseable {

    private String msg;
        
    //コンストラクタ
    MyResource (String msg){
        this.msg = msg;
    }

    public void method() throws SQLException {
        throw new SQLException("method()でのエラー");
    }

    @Override
    public void close() throws Exception {
        System.out.println("close() : " + msg);
        throw new SQLException("close()でのエラー : " + msg);
    }
}
*/