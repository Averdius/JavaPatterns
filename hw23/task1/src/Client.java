public class Client {

    public static void main(String[] args) {
        StaffList staffList = new StaffList();

        staffList.addEmployee(new Manager(60000));
        staffList.addEmployee(new SalesPerson(50000));
        staffList.addEmployee(new SalesPerson(40000));
        staffList.addEmployee(new ITSupport(70000));

        System.out.println("Total amount paid to staff: " + staffList.getSalary());

        staffList.accept(new SalaryIncrease(20));
        System.out.println("Total amount paid to staff: " + staffList.getSalary());

        staffList.accept(new Penalty(20000));
        System.out.println("Total amount paid to staff: " + staffList.getSalary());
    }

}