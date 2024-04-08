package company;

public class Employee {
    // field (zokusei)
    String name;
    String department;
    String position;
    int employeeId;
    
    // constructor
    public Employee(String name, String department, String position, int employeeId) {
        this.name = name;
        this.department = department;
        this.position = position;
        this.employeeId = employeeId;
    }
    
    // houkoku
    public void report(int times) {
        System.out.println(times + "回目の報告をします。役職：" + position + "、名前：" + name);   
        
    }
    
    // houkoku overload
    public void report() {
        report(1);
        
    }
}
