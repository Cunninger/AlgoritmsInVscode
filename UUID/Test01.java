package UUID;

class Circle {
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    public double findArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}

class Cylinder extends Circle {
    private double length;

    public Cylinder(double r, double l) {
        super(r);
        length = l;
    }

    public double findVolume() {
        return super.findArea() * length;
    }

    public String toString() {
        return "Radius: " + getRadius() + ", Length: " + length + ", Volume: " + findVolume();
    }
}

public class Test01 {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5.0, 10.0);
        System.out.println(cylinder.toString());
    }
}
