package chapter3.stringtasks.worldinline;

public class WorldInLine {
    public static void main(String[] args) {
        String line = "hi saf gkljas sfsf hi ";
        String world = "hi ";
        System.out.println(isStartAndEnd(line, world));
    }

    private static boolean isStartAndEnd(String target, String world) {
        return target.startsWith(world) && target.endsWith(world);
    }
}
