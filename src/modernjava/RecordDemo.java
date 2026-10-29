package modernjava;

/**
 * Module 13: records are compact, immutable data carriers.
 */
public class RecordDemo {

    record Point(double x, double y) {
        // Compact constructor validates the components.
        Point {
            if (!Double.isFinite(x) || !Double.isFinite(y)) {
                throw new IllegalArgumentException("Coordinates must be finite");
            }
        }

        static Point origin() {
            return new Point(0, 0);
        }

        double distanceTo(Point other) {
            double dx = x - other.x;
            double dy = y - other.y;
            return Math.sqrt(dx * dx + dy * dy);
        }
    }

    public static void main(String[] args) {
        Point origin = Point.origin();
        Point point = new Point(3, 4);

        System.out.println("Origin: " + origin);
        System.out.println("Point: " + point);
        System.out.println("x = " + point.x() + ", y = " + point.y());
        System.out.println("Distance from origin: " + point.distanceTo(origin));

        try {
            new Point(Double.NaN, 0);
        } catch (IllegalArgumentException exception) {
            System.out.println("Validation works: " + exception.getMessage());
        }
    }
}
