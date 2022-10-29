public class Main {
    public static void main(String[] args) {

        float x = 8;
        float y = 2;

        try {

            System.out.println(divide(x, y));

            x = 0;
            System.out.println(divide(x, y));

            x = 4;
            y = 0;
            System.out.println(divide(x, y));

        } catch (ArithmeticException e) {

            System.out.println("Некорректная операция деления " + x + " на " + y);

        }

    }

    static float divide(float x, float y) {

        return x / y;
    }
}