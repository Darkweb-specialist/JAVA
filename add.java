import java.io.*;

class add {
    public static void main(String args[]) {

        int m = 50;
        int n = 6;

        try {
            int div = m / n;
            System.out.println("Answer:" + div);

        }

        catch (ArithmeticException e) {
            System.out.println("Error: Zero cannot be Divied");
        }

        finally {
            System.out.println("Program continues after handling the exception");
        }
    }
}
