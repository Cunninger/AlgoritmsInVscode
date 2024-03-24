package JAVA_homework;

public class addDemo {
    private int a;
    private int b;
    private int sum;
    public addDemo(int a,int b){
        this.a = a;
        this.b = b;
        sum = a+b;
        System.out.println(a+"+"+b+"="+sum);
    }

    public static void main(String[] args) {
        addDemo ad = new addDemo(1,2);
    }
}
