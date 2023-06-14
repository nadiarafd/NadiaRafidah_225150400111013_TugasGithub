import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date birthDate = new Date();

        SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135", 800.00, birthDate);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", 16.75, 40, birthDate);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Keanu", "145", 10000, 0.06, birthDate);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234",
                5000, 0.04, 300, birthDate);
        ProductionEmployee productionEmployee = new ProductionEmployee("Budi", "123", 10.00, 100, birthDate);

        Employee[] employees = new Employee[5];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = productionEmployee;

        System.out.println("Karyawan diproses secara terpisah:\n");
        System.out.printf("%s\nPendapatan: $%.2f\n\n", salariedEmployee, salariedEmployee.earnings());
        System.out.printf("%s\nPendapatan: $%.2f\n\n", hourlyEmployee, hourlyEmployee.earnings());
        System.out.printf("%s\nPendapatan: $%.2f\n\n", commissionEmployee, commissionEmployee.earnings());
        System.out.printf("%s\nPendapatan: $%.2f\n\n", basePlusCommissionEmployee,
                basePlusCommissionEmployee.earnings());
        System.out.printf("%s\nPendapatan: $%.2f\n\n", productionEmployee, productionEmployee.earnings());

        System.out.println("Karyawan diproses secara polimorfis:\n");
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
            System.out.printf("Pendapatan: $%.2f\n\n", currentEmployee.earnings());

            SalariedEmployee SalariedEmployee = new SalariedEmployee("Daniel", "135791", 800.00, birthDate);
            HourlyEmployee HourlyEmployee = new HourlyEmployee("Karina", "246801", 16.75, 40, birthDate);
            CommissionEmployee CommissionEmployee = new CommissionEmployee("Keanu", "123456", 10000, .06, birthDate);
            BasePlusCommissionEmployee BasePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234",
                    5000, .04, 300, birthDate);

        }
    }
}
