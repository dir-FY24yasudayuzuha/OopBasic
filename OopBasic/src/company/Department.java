package company;

public class Department {
    private final String name;
    private final String departmentId;
    private int budget;
    
    // constructor
    public Department(String name, String departmentId, int budget) {
        this.name = name;
        this.departmentId = departmentId;
        this.budget = budget;
        
    }

    // kaigi
    public void meeting() {
        System.out.println("会議を開催します。部署： " + name + "、予算：" + budget);
     
    }
    
    // name getter
    public String getName() {
        return name;
    }
    
    // budget getter
    public double getBudget() {
        return budget;
    }
    
    // budget setter
    public void setBudget(int budget) {
        if (budget < 0) {
            throw new IllegalArgumentException("予算はマイナスにできません。");
            
        }
        this.budget = budget;
        
    }
}
