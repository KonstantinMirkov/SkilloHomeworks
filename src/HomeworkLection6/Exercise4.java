package HomeworkLection6;

public class Exercise4 {
    public static void main(String[] args) {
        String text = "Three words here";

        int wordCount = countWords(text);
        System.out.println("Number of words: " + wordCount);
    }

    public static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        int wordCount = 0;
        boolean inWord = false;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                inWord = true;
            } else {
                if (inWord) {
                    wordCount++;
                    inWord = false;
                }
            }
        }

        if (inWord) {
            wordCount++;
        }

        return wordCount;
    }
}
