class PostSpaceDecorator extends Decorator {
    public PostSpaceDecorator(PrintableString printableString) {
        super(printableString);
    }

    @Override
    public void print() {
        super.print();
        System.out.print(" ");
    }
}