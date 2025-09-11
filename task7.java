public class task7 {

    int addTwoNumbers (int a, int b) {
        return a + b;

    }

    int minusTwoNumbers (int a, int b) { 
        return a - b;

    }

    int multiplyTwoNumbers (int a, int b) {
        return a * b;

    }

    double divideTwoNumbers (double a, double b) {
        return a / b;

    }

        public static void main (String[] args) {

            task7 calc = new task7();

            int a = 1000;
            int b = 10;

            System.out.println("Addition Operation");
            System.out.println("a = " + a + "\nb = " + b + "\na + b = " + calc.addTwoNumbers(a, b));
            System.out.println("\nSubtraction Operation");
            System.out.println("a = " + a + "\nb = " + b + "\na - b = " + calc.minusTwoNumbers(a, b));
            System.out.println("\nMultiplication Operation");
            System.out.println("a = " + a + "\nb = " + b + "\na * b = " + calc.multiplyTwoNumbers(a, b));
            System.out.println("\nDivision Operation");
            System.out.println("a = " + a + "\nb = " + b + "\na / b = " + calc.divideTwoNumbers(a, b));
        }

}