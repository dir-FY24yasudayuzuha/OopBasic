package company;

public abstract class Employee implements Workable{
    // field (zokusei)
    protected final String name;
    protected final Department department;
    private final String position;
    private final int employeeId;
    
    // constructor
    public Employee(String name, Department department, String position, int employeeId) {
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
    
    // kaigi sanka
    public abstract void joinMeeting();
    /*public void joinMeeting() {
        department.meeting();
        System.out.println("上記の会議に参加します。部署：" + department.getName() + "名前：" + name);
    }*/
    
    // hataraku method
    @Override
    public void work() {
        System.out.println("正社員として働きます。名前：" + name + slogan);
    }
}
