public abstract class FileHandler {
    protected FileHandler nextHandler;

    public void setNextHandler(FileHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void openFile(String file);
}