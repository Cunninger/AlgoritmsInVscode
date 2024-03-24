package UUID;

interface Fruit {
    void eat();
}

class Apple implements Fruit {
    public void eat() {
        System.out.println("苹果很甜!");
    }
}

class Lemon implements Fruit {
    public void eat() {
        System.out.println("柠檬很酸!");
    }
}

public class Demo11_1 {
    public static void main(String[] args) {
        Fruit f = new Apple();
        f.eat();
        f = new Lemon();
        f.eat();
    }
}