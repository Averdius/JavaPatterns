class PostEndlDecorator extends Decorator {
    public PostEndlDecorator(PrintableString printableString) {
        super(printableString);
    }

    @Override
    public void print() {
        super.print();
        System.out.println();
    }
}