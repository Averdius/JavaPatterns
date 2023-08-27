public class Client {
    public static void main(String[] args) {

        Document document = new Document("blank.txt");
        TextEditor textEditor = new TextEditor(document);

        /////////////////////////////////////////////
        // Testing buttons, menu items...
        //////////////////////////////////////////////
        textEditor.clickSaveButton();
        textEditor.clickPrintButton();
        textEditor.selectShowInfoMenuItem();
        textEditor.selectPrintMenuItem();
        textEditor.selectSaveMenuItem();
    }
}