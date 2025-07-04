package packs;

public class Main {
    public static void main(String[] args) {
        Employee employees[] = new Employee[4];

        employees[0] = new SalariedEmployee("Azizul", "Hakim", 1, 1000);
        employees[1] = new HourlyEmployee("Ashik", "Khan", 2, 10, 50);
        employees[2] = new CommissionEmployee("Ananda", "Bhuiya", 3, 1000, 0.1);
        employees[3] = new BasePlusCommissionEmployee("Utsob", "Khilzi", 4, 1000, 0.1, 10000);

        // Increasing base salary of basePlusCommissionEmployee by 10%
        BasePlusCommissionEmployee employee4 = (BasePlusCommissionEmployee) employees[3];
        employee4.setBaseSalary(employee4.getBaseSalary() * 1.1);
        

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
            System.out.println(employees[i].earnings());
            System.out.println();
        }

        Employee employee;

        employee = employees[0];
        System.out.println(employee.earnings());

        employee = employees[1];
        System.out.println(employee.earnings());

        employee = employees[2];
        System.out.println(employee.earnings());

        employee = employees[3];
        System.out.println(employee.earnings());
    }
}
