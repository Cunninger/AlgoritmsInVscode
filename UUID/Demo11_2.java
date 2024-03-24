package UUID;

interface Shape {
    void draw();// 抽象方法

    void erase();// 抽象方法
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Circle.draw()");
    }

    public void erase() {
        System.out.println("Circle.erase()");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Square.draw()");
    }

    public void erase() {
        System.out.println("Square.erase()");
    }
}

class Triangle implements Shape
{

    public void draw() {
        System.out.println("Triangle.draw()");
    }

    public void erase() {
        System.out.println("Triangle.erase()");
    }
}

public class Demo11_2 {
    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        int n;
        for (int i = 0; i < s.length; i++) {
            n = (int) (Math.random() * 3);
            switch (n) {
                case 0:
                    s[i] = new Circle();
                    break;
                case 1:
                    s[i] = new Square();
                    break;
                case 2:
                    s[i] = new Triangle();
            }
        }
        for (int i = 0; i < s.length; i++)
            s[i].draw();
    }
}
