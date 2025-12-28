

import java.util.Scanner;

                public class Main {
                    public static void main(String[] args) {

                        Scanner scanner = new Scanner(System.in);

                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Are you employed? (true/false): ");
                        boolean isEmployed = scanner.nextBoolean();
                        scanner.nextLine();

                        System.out.print("Enter university: ");
                        String university = scanner.nextLine();

                        System.out.print("Enter gpa: ");
                        String gpaInput = scanner.nextLine();
                        float gpa = Float.parseFloat(gpaInput);

                        scanner.nextLine();

                        Student student1 = new Student(age, name, true, university, gpa);
                        student1.showInfo();

                        Human student2 = new Student(20, "Karakat", true, "AITU", 3.8f);
                        student2.showInfo();

                        IStudyable student3 = new Student(23, "Asylzhan", true, "IITU", 3.6f);
                        student3.study();

                        Employee employee1 = new Employee(24, "Alisa", true, "Engineering", 75000.0f);
                        employee1.showInfo();
                        employee1.setDepartment("Software Engineering");
                        System.out.println("Department: "+employee1.getDepartment());

                        Human employee2 = new Employee(22, "Samat", true, "Marketing", 65000.0f);
                        employee2.showInfo();

                        IWorkable employee3 = new Employee(25, "Diana", true ,"HR", 60000.0f);
                        employee3.work();

                        IStudyable employee4 = new Employee(21, "Erlan", true, "Finance", 80000.0f);
                        employee4.study();



                        Human human1 = new Student(age, name, isEmployed, university, gpa);

                        human1.setAge(23);
                        human1.setName("Alisher");
                        human1.setEmployed(false);


                        Employee employee = new Employee(18, "Mansur", false,
                                "Analyst", 250000);

                        employee.setPosition("Developer");
                        employee.setSalary(450000);

                        Student student = new Student(68, "Alua", true,
                                "AITU", 3.2f);

                        student.setGpa(2.72f);
                        student.setUniversity("IITU");

                        System.out.println(human1.getInfo());
                        System.out.println(employee.getInfo());
                        System.out.println("Company: " + Employee.companyName);
                        System.out.println(student.getInfo());

                        human1.introduce();
                        employee.introduce();
                        student.introduce();
                        student1.showInfo();
                        student1.study();
                        System.out.println("GPA: "+student1.calculateGPA());
                        System.out.println("Student Type: " + student1.getStudentType());

                        employee1.introduce();
                        employee1.showInfo();
                        employee1.work();
                        employee1.study();
                        System.out.println("Professional GPA: " + employee1.calculateGPA());
                        System.out.println("Department: " + employee1.getDepartment());

                        Human[] humans = new Human[4];
                        humans[0]=student1;
                        humans[1]=(Student) student2;
                        humans[2]=employee1;
                        humans[3]=(Employee) employee2;

                        for (Human human : humans) {
                            human.showInfo();
                            System.out.println();
                        }
                        scanner.close();
                    }
}
