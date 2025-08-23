package String.level_1;

public class NullPointer {

    public static void GenerateException() {
        String Text = null;
        Text.length();
    }

    public static void HandleException() {
        String Text = null;
        try {
            Text.length();
        } catch (NullPointerException e) {
            System.out.println("Exception Handled");
        }
    }

    public static void main(String[] args) {
        // GenerateException();
        HandleException();
    }
}

