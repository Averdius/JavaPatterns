public class TextEditor {

    private Document document;

    private Button saveButton;
    private Button printButton;

    private MenuItem saveMenuItem;
    private MenuItem printMenuItem;
    private MenuItem showInfoMenuItem;

    public TextEditor(Document document) {
        this.document = document;

        saveButton = new Button();
        printButton = new Button();

        saveMenuItem = new MenuItem();
        printMenuItem = new MenuItem();
        showInfoMenuItem = new MenuItem();

        saveButton.setCommand(new SaveCommand(document));
        printButton.setCommand(new PrintCommand(document));
        saveMenuItem.setCommand(new SaveCommand(document));
        printMenuItem.setCommand(new PrintCommand(document));
        showInfoMenuItem.setCommand(new ShowInfoCommand(document));
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public void clickPrintButton() {
        printButton.click();
    }

    public void selectSaveMenuItem() {
        saveMenuItem.select();
    }

    public void selectPrintMenuItem() {
        printMenuItem.select();
    }

    public void selectShowInfoMenuItem() {
        showInfoMenuItem.select();
    }
}