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

            task7 addnum = new task7();

            int a = 1000;
            int b = 10;

            System.out.println("Addition Operation");
            System.out.println("a = " + a + "\nb = " + b + "\na + b = " + addnum.addTwoNumbers(a, b));
            System.out.println("Subtraction Operation");
            System.out.println("a = " + a + "\nb = " + b + "\na + b = " + addnum.minusTwoNumbers(a, b));
            System.out.println("Multiplication Operation");
            System.out.println("a = " + a + "\nb = " + b + "\na + b = " + addnum.multiplyTwoNumbers(a, b));
            System.out.println("Division Operation");
            System.out.println("a = " + a + "\nb = " + b + "\na + b = " + addnum.divideTwoNumbers(a, b));
        }

}