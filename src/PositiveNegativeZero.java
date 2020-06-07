public class PositiveNegativeZero {

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number == 0) {
            System.out.println("equal to 0");
        } else {
            System.out.println("negative");
        }
    }

    public static void main(String[] args) {

        checkNumber(8);
        checkNumber(0);
        checkNumber(-5);

    }

}
