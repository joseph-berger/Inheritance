// SalaryWorker.java
public class SalaryWorker extends Worker {
    private double annualSalary;

    public SalaryWorker(String id, String firstName, String lastName, String title, int yearOfBirth, double hourlyPayRate, double annualSalary) {
        super(id, firstName, lastName, title, yearOfBirth, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return annualSalary / 52.0; // Weekly pay is the yearly salary divided by 52 weeks
    }

    @Override
    public String displayWeeklyPay(double hoursWorked) {
        double weeklyPay = calculateWeeklyPay(hoursWorked);
        return "Weekly pay is $" + String.format("%.2f", weeklyPay) + ", which is a fraction of the yearly salary.";
    }

    // Getter and setter for annualSalary
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
}
