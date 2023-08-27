public class ShowInfoCommand implements Command {
    private Document document;

    public ShowInfoCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.showInfo();
    }
}