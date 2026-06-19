package q2;

import java.awt.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the details for Person:");
        String name = scanner.next();
        String address = scanner.nextLine();
        String phone = scanner.next();
        String email = scanner.next();
        Person person = new Person(name, address, phone, email);

        System.out.println("\nEnter the details for Student:");
        name = scanner.next();
        address = scanner.nextLine();
        phone = scanner.next();
        email = scanner.next();
        String status = scanner.next();
        Student student = new Student(name, address, phone, email, status);

        System.out.println("\nEnter the details for Employee:");
        name = scanner.next();
        address = scanner.nextLine();
        phone = scanner.next();
        email = scanner.next();
        String office = scanner.next();
        double salary = scanner.nextDouble();
        MyDate dateHired = new MyDate(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        Employee employee = new Employee(name, address, phone, email, office, salary, dateHired);

        System.out.println("\nEnter the details for Faculty:");
        name = scanner.next();
        address = scanner.nextLine();
        phone = scanner.next();
        email = scanner.next();
        office = scanner.next();
        salary = scanner.nextDouble();
        
        
        
        dateHired = new MyDate(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        String officeHours = scanner.next();
        String rank = scanner.next();
        Faculty faculty = new Faculty(name, address, phone, email, office, salary, dateHired, officeHours, rank);

        System.out.println("\nEnter the details for Staff:");
        name = scanner.next();
        address = scanner.nextLine();
        phone = scanner.next();
        email = scanner.next();
        office = scanner.next();
        salary = scanner.nextDouble();
        dateHired = new MyDate(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        String title = scanner.next();
        Staff staff = new Staff(name, address, phone, email, office, salary, dateHired, title);

        System.out.println("\nPerson: " + person.toString());
        System.out.println("Student: " + student.toString());
        System.out.println("Employee: " + employee.toString());
        System.out.println("Faculty: " + faculty.toString());
        System.out.println("Staff: " + staff.toString());
    }
}