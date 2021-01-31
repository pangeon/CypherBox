package pl.cecherz.generators;

public class NotRestrictPasswordException extends Exception {
    private static final String cause = "Password size not match to pattern.";

    public void printCause() {
        System.out.println(cause);
    }
}
