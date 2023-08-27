class PreWordDecorator extends Decorator {
    private String word;

    public PreWordDecorator(PrintableString printableString, String word) {
        super(printableString);
        this.word = word;
    }

    @Override
    public void print() {
        System.out.print(word);
        super.print();
    }
}