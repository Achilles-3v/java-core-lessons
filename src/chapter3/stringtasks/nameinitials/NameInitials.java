package chapter3.stringtasks.nameinitials;

public class NameInitials {
    public static void main(String[] args) {
        String result = formatName("Ivan", "Sidorov", "Ivanovich");
        System.out.println(result);
    }

    public static String formatName(String firstName, String lastName, String patronymicName) {
        char firstNameChar = firstName.toUpperCase().charAt(0);
        char lastNameChar = lastName.toUpperCase().charAt(0);
        char patronymicNameChar = patronymicName.toUpperCase().charAt(0);

        return String.format("%s.%s.%s", lastNameChar, firstNameChar, patronymicNameChar);
    }
}
