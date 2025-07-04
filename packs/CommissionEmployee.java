
package packs;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, long socialSecurityNumber, double grossSales,
            double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
 
    @Override
    public double earnings() {
        return grossSales * commissionRate;
    }
    @Override
    public String toString() {
        return "Type : Commission Employee" + "\nGross sales : " + grossSales + "\nCommission Rate : " + commissionRate + "\n" + super.toString();
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }
}
