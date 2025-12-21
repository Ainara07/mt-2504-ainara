

public class Employee extends Human {
    private String position;
    private float salary;

    public static String companyName = "AITU";
    public Employee (int age, String name, boolean isEmployed,
                     String position, float salary ) {
        super(age,name,isEmployed);
        this.position = position;
        this.salary= salary;
    }
    @Override
    public String getInfo() {
        return super.getInfo() + ", Position: " + position + ", Salary: " + salary;
    }
    @Override
    public void introduce(){
        System.out.println("Hello, my name is " + getName() + ", I am an employee.");
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary( float salary) {
        this.salary= salary;
    }
}