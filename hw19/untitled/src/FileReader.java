import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    private final String filePath;
    private final List<Observer> observers = new ArrayList<>();

    public FileReader(String filePath) {
        this.filePath = filePath;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void read() {
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath))) {
            reader.lines().forEach(this::notifyObservers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void notifyObservers(String line) {
        for (Observer observer : observers) {
            observer.update(line);
        }
    }
}