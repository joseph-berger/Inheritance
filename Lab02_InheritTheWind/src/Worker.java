// Worker.java
public class Worker extends Person {
    private double hourlyPayRate;

    public Worker(String id, String firstName, String lastName, String title, int yearOfBirth, double hourlyPayRate) {
        super(id, firstName, lastName, title, yearOfBirth);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        double regularPay;
        double overtimePay;

        if (hoursWorked <= 40) {
            regularPay = hoursWorked * hourlyPayRate;
            overtimePay = 0;
        } else {
            regularPay = 40 * hourlyPayRate;
            overtimePay = (hoursWorked - 40) * hourlyPayRate * 1.5;
        }

        return regularPay + overtimePay;
    }

    public String displayWeeklyPay(double hoursWorked) {
        double regularPay;
        double overtimePay;

        if (hoursWorked <= 40) {
            regularPay = hoursWorked * hourlyPayRate;
            overtimePay = 0;
        } else {
            regularPay = 40 * hourlyPayRate;
            overtimePay = (hoursWorked - 40) * hourlyPayRate * 1.5;
        }

        double totalPay = regularPay + overtimePay;

        return "Regular hours: " + String.format("%.2f", 40.0) + " - Pay: $" + String.format("%.2f", regularPay) +
                "\nOvertime hours: " + String.format("%.2f", hoursWorked - 40.0) + " - Pay: $" + String.format("%.2f", overtimePay) +
                "\nTotal Pay: $" + String.format("%.2f", totalPay);
    }

    // Getter and setter for hourlyPayRate
    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }
}
