interface ShapeArea {
    double getArea();
    double getPerimeter();
}

class MyRectangle implements ShapeArea {
    private double width;
    private double height;

    public MyRectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public String toString() {
        return "width=" + width + ", height=" + height + ", perimeter=" + getPerimeter() + ", area=" + getArea();
    }
}

class MyTriangle implements ShapeArea {
    private double ab;
    private double bc;
    private double ca;
    private double s;

    public MyTriangle(double x, double y, double z) {
        this.ab = x;
        this.bc = y;
        this.ca = z;
        this.s = (ab + bc + ca) / 2;
    }

    public double getArea() {
        return Math.sqrt(s * (s - ab) * (s - bc) * (s - ca));
    }

    public double getPerimeter() {
        return ab + bc + ca;
    }

    public String toString() {
        return "three sides: " + ab + ", " + bc + ", " + ca + ", perimeter=" + getPerimeter() + ", area=" + getArea();
    }
}
