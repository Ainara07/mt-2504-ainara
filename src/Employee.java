

public class Employee extends Human implements IWorkable, IStudyable {
    private String position;
    private float salary;

    private String department;

    public static String companyName = "AITU";
    public Employee (int age, String name, boolean isEmployed,
                     String position, float salary ) {
        super(45,name,isEmployed);
        this.position = position;
        this.salary= salary;
    }

    @Override
    public void work() {
        System.out.println(name + " is working as " + position);
    }

    @Override
    public String getDepartment() {
        return department;
    }

    @Override
    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void study() {
        System.out.println(name + " is studying for professional development");
    }

    @Override
    public double calculateGPA() {
        return 3.5;
    }

    @Override
    public void showInfo() {
        System.out.println("Employee's name: " + name + ", age: " + age + ", position: " + position + ", salary: " + salary);
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