package company;

import java.lang.invoke.VarHandle;

public class ObjectSample {

    public static void main(String[] args) {
        // インスタンス作成
        var department = new Department("営業部", "xx", 8870000);
        var employee = new Employee("矢花", department, "リーダー", 887);
        
        // インスタンスメソッドの呼び出し
        employee.report();
        employee.report(2);
        employee.joinMeeting();
        
        // 一行開ける
        System.out.println("");
        
        // インスタンス（クラスの具現化）の作成
        var devDepartment = new Department("開発部", "yy", 0);
        var engineer = new Employee("佐々木", devDepartment, "一般社員", 172);
        
        engineer.report();
        engineer.report(2);
        engineer.joinMeeting();
    }

}
