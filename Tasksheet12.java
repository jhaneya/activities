 class point {
    private double x;
    private double y;

    public point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void scale() {
        x = x / 2;
        y = y / 2;
    }

    public void print() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

public class Tasksheet12 {
    public static void main(String[] args) {
        point p = new point(32, 32);

        for (int i = 0; i < 5; i++) {
            p.scale();
            p.print();
        }
    }
}
 