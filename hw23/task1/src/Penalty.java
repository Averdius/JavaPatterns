public class Penalty implements Visitor {
    private int amount;
    public Penalty(int amount) {
        this.amount = amount;
    }

    @Override
    public void visit(Manager manager) {
        manager.setSalary((int)(manager.getSalary() - amount));
    }

    @Override
    public void visit(SalesPerson salesPerson) {
        salesPerson.setSalary((int)(salesPerson.getSalary() - amount));
    }

    @Override
    public void visit(ITSupport itSupport) {
        itSupport.setSalary((int)(itSupport.getSalary() - amount));
    }
}
