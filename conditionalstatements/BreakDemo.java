
public class BreakDemo {
    public static void main(String args[])
    {
        for (int i = 0; i < 10; i++) {
            // If the number is even
            // break and Terminate and it will not print anything.
            if (i % 2 == 0)
                break;

            // If number is Even, igmore it
            System.out.print("");
        }
    }
}
