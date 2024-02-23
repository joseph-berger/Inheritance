import java.util.ArrayList;
import java.util.Scanner;

public class InheritanceDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Worker> workers = new ArrayList<>();

        // Collect data for 3 Worker instances
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Worker " + (i + 1) + ":");
            System.out.print("ID: ");
            String id = scanner.nextLine();
            System.out.print("First Name: ");
            String firstName = scanner.nextLine();
            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Year of Birth: ");
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            System.out.print("Hourly Pay Rate: ");
            double hourlyPayRate = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            Worker worker = new Worker(id, firstName, lastName, title, yearOfBirth, hourlyPayRate);
            workers.add(worker);
        }

        // Collect data for 3 SalaryWorker instances
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for SalaryWorker " + (i + 1) + ":");
            System.out.print("ID: ");
            String id = scanner.nextLine();
            System.out.print("First Name: ");
            String firstName = scanner.nextLine();
            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Year of Birth: ");
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            System.out.print("Annual Salary: ");
            double annualSalary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            System.out.print("Hourly Pay Rate: ");
            double hourlyPayRate = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            SalaryWorker salaryWorker = new SalaryWorker(id, firstName, lastName, title, yearOfBirth, hourlyPayRate, annualSalary);
            workers.add(salaryWorker);
        }

        scanner.close();

        // Simulate 3 weekly pay periods
        for (int week = 1; week <= 3; week++) {
            System.out.println("Week " + week + " Pay:");
            System.out.println("--------------------------------------------------------");
            System.out.println("Worker ID   |   Worker Name   |   Weekly Pay");
            System.out.println("--------------------------------------------------------");

            for (Worker worker : workers) {
                double hoursWorked;
                if (week == 1 || week == 3) {
                    hoursWorked = 40.0; // Week 1 and 3: 40-hour week
                } else {
                    hoursWorked = 50.0; // Week 2: 50-hour week
                }

                double weeklyPay = worker.calculateWeeklyPay(hoursWorked);
                System.out.printf("%-12s|   %-15s|   $%.2f%n", worker.getId(), worker.fullName(), weeklyPay);
            }

            System.out.println("--------------------------------------------------------\n");
        }
    }
}
