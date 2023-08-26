
public class LongestWordLineObserver implements Observer {
    private String lineWithLongestWord = "";
    private String longestWord = "";

    @Override
    public void update(String line) {
        String[] words = line.split("\\s+");
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
                lineWithLongestWord = line;
            }
        }
    }

    public String getLineWithLongestWord() {
        return lineWithLongestWord;
    }

    public String getLongestWord() {
        return longestWord;
    }
}