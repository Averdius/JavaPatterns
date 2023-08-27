class PostWordDecorator extends Decorator {
    private String word;

    public PostWordDecorator(PrintableString printableString, String word) {
        super(printableString);
        this.word = word;
    }

    @Override
    public void print() {
        super.print();
        System.out.print(word);
    }
}