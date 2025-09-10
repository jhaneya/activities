public class task3 {
    public static void main(String[] args) {
        String a = "wow";
        String b = "wow";
        String c = "wow!";
        String d = "wow!";

        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }


    }
}
