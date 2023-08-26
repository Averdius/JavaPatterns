import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader("src/input01.txt");

        LongestLineObserver longestLineObserver = new LongestLineObserver();
        LongestWordObserver longestWordObserver = new LongestWordObserver();
        WordCountObserver wordCountObserver = new WordCountObserver();
        LongestWordLineObserver longestWordLineObserver = new LongestWordLineObserver();

        fileReader.addObserver(longestLineObserver);
        fileReader.addObserver(longestWordObserver);
        fileReader.addObserver(wordCountObserver);
        fileReader.addObserver(longestWordLineObserver);

        fileReader.read();

        System.out.println("Найдовгий рядок: " + longestLineObserver.getLongestLine());
        System.out.println("Найдовше слово: " + longestWordLineObserver.getLongestWord());
        System.out.println("Рядок з найдовшим словом: " + longestWordLineObserver.getLineWithLongestWord());
        System.out.println("Кількість слів: " + wordCountObserver.getWordCount());
    }

}