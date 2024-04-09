package company;

public class Sales extends Employee {
    // constructor
    public Sales(String name, Department department, String position, int employeeId) {
        super(name, department, position, employeeId);
    }
    
    // kaigi sanka method
    @Override
    public void joinMeeting() {
        department.meeting();
        System.out.println("→営業として、上記の会議に参加します。部署：" + department.getName() + "名前：" + name);

    }
}
