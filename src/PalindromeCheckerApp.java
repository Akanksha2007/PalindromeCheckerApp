public class PalindromeCheckerApp {
    private static final String APP_VERSION = "1.0.0";
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("     PALINDROME CHECKER APPLICATION     ");
        System.out.println("========================================");
        System.out.println("Version: " + APP_VERSION);
        System.out.println("Status: System Ready...");
        System.out.println("----------------------------------------");
        System.out.println("--- Palindrome Checker App v1.1 ---");
        String original = "madam";
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        if (original.equals(reversed)) {
            System.out.println("The word '" + original + "' is a Palindrome.");
        } else {
            System.out.println("The word '" + original + "' is NOT a Palindrome.");
        }
    }
}