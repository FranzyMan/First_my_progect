package test;

public abstract class Test {
    protected String name, type;

    public void execute(){
        System.out.println(name + "" +type);
    }

    public String getType() {
        return type;
    }
}
