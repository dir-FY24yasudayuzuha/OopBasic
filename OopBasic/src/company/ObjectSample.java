package company;

import java.lang.invoke.VarHandle;

public class ObjectSample {

    public static void main(String[] args) {
        // インスタンス作成
        var employee = new Employee("中村", "営業部", "リーダー", 887);
        
        // インスタンスメソッドの呼び出し
        employee.report();
        employee.report(2);
        
        // 一行開ける
        System.out.println("");
        
        // インスタンス（クラスの具現化）の作成
        var engineer = new Employee("佐々木", "開発部", "一般社員", 172);
        
        engineer.report();
        engineer.report(2);
    }

}
