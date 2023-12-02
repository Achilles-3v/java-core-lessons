package chapter3.stringtasks.smile;

/** Заменить все грустные смайлы на веселые **/

public class Smile {
    public static void main(String[] args) {
        String value = "hello :) world :( i :) am :( a :) smile :(";
        String result = replace(value);
        System.out.println(result);
    }

    public static String replace(String value) {
        return value.replace(":(", ":)");
    }
}
