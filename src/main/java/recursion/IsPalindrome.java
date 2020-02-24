package recursion;

public class IsPalindrome {

    void isPalindrome(String text) {

        String inputText = text;
        text = text.replaceAll(" ", "");
        text = text.replaceAll(",", "");
        text = text.toUpperCase();

        int leftPos = 0;
        int rightPos = text.length() - 1;

        if (text.length() % 2 != 0 || checkIsPalindrome(leftPos, rightPos, text)) {
            System.out.println("Wyrażenie \"" + inputText + "\" jest palindromem :)");
        } else {
            System.out.println("Wyrażenie \"" + inputText + "\" nie jest palindromem :(\n");
        }
    }

    boolean checkIsPalindrome(int leftPos, int rightPos, String text) {
        if (leftPos == rightPos) {
            return true;
        } else {
            if (text.charAt(leftPos) == text.charAt(rightPos)) {
                return checkIsPalindrome(leftPos + 1, rightPos - 1, text);
            } else {
                return false;
            }
        }
    }
}
