public class LongestWordObserver implements Observer {
    private String longestWord = "";
    private String word = "";
    @Override
    public void  update(String line) {
        String[] words = line.split("\\s+");
        for(String word : words) {
            if(word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
    }
    public String getWord() {
        return word;
    }
}
