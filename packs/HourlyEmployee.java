
package packs;

public class HourlyEmployee extends Employee {
    private double wagePerHour;
    private int totalHoursWorked;

    public HourlyEmployee(String firstName, String lastName, long socialSecurityNumber, double wagePerHour,
            int totalHoursWorked) {
        super(firstName, lastName, socialSecurityNumber);

        this.wagePerHour = wagePerHour;
        this.totalHoursWorked = totalHoursWorked;
    }

    public double earnings() {
        if (totalHoursWorked > 40) {
            int overTime = totalHoursWorked - 40;

            return (40 * wagePerHour + overTime * wagePerHour * 1.5);
        } else
            return wagePerHour * totalHoursWorked;
    }

    @Override
    public String toString() {
        return "Type : Hourly Employee" + "\nWage per hour : " + wagePerHour + "\nTotal hours worked : "
                + totalHoursWorked + "\n" + super.toString();
    }
}
