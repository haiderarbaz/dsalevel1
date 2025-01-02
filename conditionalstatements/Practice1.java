
public class Practice1 {

    public static void main(String[] args)
    {
        char ch = 'a';

        if (ch == 'a') {

            System.out.println("First");
        }
        else if (ch - 97 + 1 == 1) {
            System.out.println("Second");
        }

        if (ch - 97 + 1 == 1) {
            System.out.println("Third");
        }
    }
}