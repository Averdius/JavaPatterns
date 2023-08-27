public class Main {
    public static void main(String[] args) {
        PrintableString baseString = new PrintableString("");

        PrintableString decoratedString = new PostExclaimDecorator(new PostWordDecorator(new PostSpaceDecorator(new PostComaDecorator(new PreWordDecorator(baseString, "Hello"))), "World"));

        decoratedString.print();
    }
}