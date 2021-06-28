package utils;

public class StringUtils {

    public static Integer getIntFromString(String text) {
        String regex = "[^0-9]";
        String updatedText = text.replaceAll(regex, "");
        try {
            return Integer.parseInt(updatedText);
        } catch (Exception e) {
            return null;
        }
    }
}
