package chapter3.stringtasks.countsymbols;

public class CountSymbols {
    public static void main(String[] args) {
        String text = "sfsf.,sgsg!!slkka,,4uiwj,sg.";
        System.out.println(counter(text));
    }

    public static int counter(String value) {
        String result = value.replace(".", "")
                .replace(",", "")
                .replace("!", "");
        return value.length() - result.length();
    }
}
