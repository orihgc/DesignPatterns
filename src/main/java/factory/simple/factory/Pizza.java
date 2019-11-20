package factory.simple.factory;

import java.util.ArrayList;

public class Pizza {
    String name;
    String dough;
    String sauce;

    ArrayList<String> toppings = new ArrayList<String>();

    void prepare() {
        System.out.println("准备 " + name);
        System.out.println("揉面团...");
        System.out.println("添加酱料...");
        System.out.println("添加作料: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("   " + toppings.get(i));
        }
    }

    public void bake() {
        System.out.println("烘烤25分钟");
    }

    public void cut() {
        System.out.println("把Pizza对角切片");
    }

    public void box() {
        System.out.println("把Pizza装盒子");
    }

    public String getName() {
        return name;
    }
}
