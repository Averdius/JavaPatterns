public class SalaryIncrease implements Visitor {

    private double percentage;
    public SalaryIncrease(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public void visit(Manager manager) {
        manager.setSalary((int)(manager.getSalary()*(1 + percentage/100)));
    }

    @Override
    public void visit(SalesPerson salesPerson) {
        salesPerson.setSalary((int)(salesPerson.getSalary()*(1 + percentage/100)));
    }

    @Override
    public void visit(ITSupport itSupport) {
        itSupport.setSalary((int)(itSupport.getSalary()*(1 + percentage/100)));
    }
}
