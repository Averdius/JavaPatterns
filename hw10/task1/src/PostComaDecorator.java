class PostComaDecorator extends Decorator {
    public PostComaDecorator(PrintableString printableString) {
        super(printableString);
    }

    @Override
    public void print() {
        super.print();
        System.out.print(", ");
    }
}