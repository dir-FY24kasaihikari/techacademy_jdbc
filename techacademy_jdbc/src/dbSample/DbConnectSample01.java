package dbSample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectSample01 {

    public static void main(String[] args) {
        try {
            // 1. ドライバーのクラスをJava上で読み込む
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // 2. DBと接続する
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/world?useSSL=false&allowPublicKeyRetrieval=true",
                    "root",
                    "kAihatsukensyu1024#"
                );
            
            // 3. DBとやりとりする窓口（Statementオブジェクト）の作成

            // 4, 5. Select文の実行と結果を格納／代入

            // 6. 結果を表示する
         
        } catch (ClassNotFoundException e) {
            System.out.println("JDBCドライバーのロードに失敗しました。");
            e.printStackTrace();
        }
            // 7. 接続を閉じる
 catch (SQLException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }
       
    }

}
