class PostExclaimDecorator extends Decorator {
    public PostExclaimDecorator(PrintableString printableString) {
        super(printableString);
    }

    @Override
    public void print() {
        super.print();
        System.out.print("!");
    }
}