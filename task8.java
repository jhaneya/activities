public class task8 {
    static int sumAndShow(int... numbers) {
        int grandTotal = 0;

        for (int n : numbers) {
            int triangular = n * (n + 1) / 2;

            System.out.println("Parameter: " + n +
                               " -> Sum(1.." + n + ") = " + triangular);

            grandTotal += triangular;
            System.out.println("Cumulative total so far: " + grandTotal);
            System.out.println();
        }

        return grandTotal;
    }

    public static void main(String[] args) {
        int total = sumAndShow(4, 5, 10);
        System.out.println("Final Total = " + total);
    }
}