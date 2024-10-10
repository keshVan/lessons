public class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(){};

    public Point(Point p) {
        this(p.x, p.y);
    }


    public String toString() {
        return "{" + x + ";" + y + "}";
    }
}
