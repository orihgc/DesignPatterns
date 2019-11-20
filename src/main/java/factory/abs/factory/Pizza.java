package factory.abs.factory;

public abstract class Pizza {
    String name;
    Dough dough;

    abstract void prepare();

    public void bake() {
        System.out.println("烘烤25分钟");
    }

    public void cut() {
        System.out.println("把Pizza对角切片");
    }

    public void box() {
        System.out.println("把Pizza装盒子");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
