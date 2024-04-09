package company;

import java.lang.invoke.VarHandle;

public class ObjectSample {

    public static void main(String[] args) {
        // instance
        var salesDepartment = new Department("営業部", "xx", 1000000);
        Employee sales = new Sales("本高", salesDepartment, "課長", 10000);
        // インスタンス作成
        var department = new Department("営業部", "xx", 8870000);
        //var employee = new Employee("矢花", department, "リーダー", 887);
        
        // インスタンスメソッドの呼び出し
        sales.report();
        sales.report(2);
        //public void report(int times) { 
        sales.joinMeeting(); 
        
        // 一行開ける
        System.out.println("");
        
        // インスタンス（クラスの具現化）の作成
        var devDepartment = new Department("開発部", "yy", 0);
        // var engineer = new Engineer("佐々木", devDepartment, "一般社員", 172, "Java");
        Engineer engineer = new Engineer("佐々木", devDepartment, "一般社員", 172, "Java");
        
        // instance method call
        engineer.report();
        engineer.joinMeeting();
        engineer.developSoftware();
        
        // akeru
        System.out.println("");
        
        // polymorphism kakunin
        Employee projectManager = new Engineer("中村", devDepartment, "PM", 99, "Java");
        
        // instance method yobidashi
        projectManager.report(); 
        projectManager.joinMeeting();
        if (projectManager instanceof Engineer) {
            //developsoftware yobidashi
            ((Engineer) projectManager).developSoftware();
        }
        
        // kaigyou
        System.out.println("");
        
        // parttimeworker instance
        var parttimeWorker = new ParttimeWorker("今野", department);
        // perttimeWorker と Employee は型が違うからポリモーフィズムできない
        
        ((Workable) sales).work();
        ((Workable) engineer).work();
        ((Workable) projectManager).work();
        ((Workable) parttimeWorker).work();
        
    }

}
