package chapter3.stringtasks.wordinline;

public class WordInLine {
    public static void main(String[] args) {
        String line = "hi saf gkljas sfsf hi ";
        String word = "hi ";
        System.out.println(isStartAndEnd(line, word));
    }

    private static boolean isStartAndEnd(String target, String word) {
        return target.startsWith(word) && target.endsWith(word);
    }
}
