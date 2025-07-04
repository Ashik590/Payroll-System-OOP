package packs;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, long socialSecurityNumber, double grossSales,
            double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return super.earnings() + baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public String toString() {
        return "Type : Base Plus Commission Employee" + "\nGross Sales : "+ getGrossSales() + "\nCommission Rate : " + getCommissionRate() + "\nBase salary : " + baseSalary + "\nFirst Name : " + getFirstName() + "\nLast Name : " + getLastName() + "\nSocial Security Number : " + getSocialSecurityNumber();
    }
}
