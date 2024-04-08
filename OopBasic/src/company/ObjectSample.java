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
        //public void report(int times) { 
        employee.joinMeeting();
        
        // 一行開ける
        System.out.println("");
        
        // インスタンス（クラスの具現化）の作成
        var devDepartment = new Department("開発部", "yy", 0);
        var engineer = new Engineer("佐々木", devDepartment, "一般社員", 172, "Java");
        
        engineer.report();
        engineer.joinMeeting();
        engineer.developSoftware();
        
        // polymorphism kakunin
        Employee projectManager = new Engineer("中村", devDepartment, "PM", 99, "Java");
        
        // instance method yobidashi
        projectManager.report(); 
        //Employee の[public void report(int times) {]でこの書き方が定義
        projectManager.joinMeeting();
        if (projectManager instanceof Engineer) {
            //developsoftware yobidashi
            ((Engineer) projectManager).developSoftware();
            
        }
    }

}
