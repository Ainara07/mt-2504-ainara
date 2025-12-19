package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Are you 18?ai (true/false): ");
        boolean isEighteen = scanner.nextBoolean();

        Human human = new Human(age, name, isEighteen);

        Employee employee = new Employee(18, "Mansur", false,
                "Analytic", 250000);

        Student student = new Student(68, "Alua", true,
                "AITU", 3.2f);


        System.out.println(human.getInfo());
        System.out.println(employee.getInfo());
        System.out.println("Company: " + Employee.companyName);
        System.out.println(student.getInfo());

        human.introduce();
        employee.introduce();
        student.introduce();


    }
}
