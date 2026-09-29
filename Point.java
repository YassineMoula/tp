public class Point {
    private int abs;
    private int ord;

    public Point(int x, int y) {
        abs = x;
        ord = y;
    }

    public Point(int x) {
        abs = x;
        ord = 2 * x;
    }

    void translation(int d) {
        abs += d;
    }

    void translation(int d, int d1) {
        abs = abs + d;
        ord = ord + d1;
    }

    void affiche() {
        System.out.println("abs = " + abs);
        System.out.println("ord = " + ord);
    }
}

class test {
    public static void main(String[] args) {
        Point p = new Point(2, 3);
        p.translation(6);
        p.translation(4, 4);
        p.affiche();

        System.out.println("****************");

        Point p1 = new Point(5);
        p1.translation(3);
        p1.translation(2, 4);
        p1.affiche();
    }
}
