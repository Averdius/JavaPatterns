class Decorator extends PrintableString {
    protected PrintableString printableString;

    public Decorator(PrintableString printableString) {
        super("");
        this.printableString = printableString;
    }

    @Override
    public void print() {
        printableString.print();
    }
}