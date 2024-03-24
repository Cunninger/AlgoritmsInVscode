package UUID;

abstract class Fruit {
    public abstract void eat();
}

// 2） 定义一个苹果类，继承水果类
class Apple extends Fruit {
    public void eat() {
        System.out.println("苹果很甜!");
    }
}

// 3） 定义一个柠檬类，继承水果类
class Lemon extends Fruit {
    public void eat() {
        System.out.println("柠檬很酸!");
    }
}

// 4） 测试类
public class Demo10_1 {
    public static void main(String[] args) {
        Fruit f = new Apple();
        f.eat();
        f = new Lemon();
        f.eat();
    }
}
