import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Are you employed? (true/false): ");
        boolean isEmployed = scanner.nextBoolean();

        Human human = new Human(age, name, isEmployed);

        human.setAge(23);
        human.setName("Alisher");
        human.setEmployed(false);


        Employee employee = new Employee(18, "Mansur", false,
                "Analyst", 250000);

        employee.setPosition("Developer");
        employee.setSalary(450000);

        Student student = new Student(68, "Alua", true,
                "AITU", 3.2f);

        student.setGpa(2.72f);
        student.setUniversity("IITU");


        System.out.println(human.getInfo());
        System.out.println(employee.getInfo());
        System.out.println("Company: " + Employee.companyName);
        System.out.println(student.getInfo());

        human.introduce();
        employee.introduce();
        student.introduce();


    }
}
