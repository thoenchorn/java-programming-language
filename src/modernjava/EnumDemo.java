package modernjava;

/**
 * Module 13: enums can hold fields, constructors, and behavior.
 */
public class EnumDemo {

    enum Planet {
        MERCURY(3.303e+23, 2.4397e6),
        EARTH(5.976e+24, 6.371e6),
        MARS(6.421e+23, 3.3972e6);

        private final double mass;
        private final double radius;

        Planet(double mass, double radius) {
            this.mass = mass;
            this.radius = radius;
        }

        double surfaceGravity() {
            final double gravitationalConstant = 6.67430e-11;
            return gravitationalConstant * mass / (radius * radius);
        }
    }

    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.printf("%s gravity: %.2f m/s^2%n", planet, planet.surfaceGravity());
        }

        Planet selected = Planet.MARS;
        String description = switch (selected) {
            case MERCURY -> "Closest to the sun";
            case EARTH -> "Our home";
            case MARS -> "The red planet";
        };
        System.out.println(selected + ": " + description);
    }
}
