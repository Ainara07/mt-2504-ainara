

public abstract class Human {
    protected int age;
    protected String name;
    protected boolean isEmployed;

    public Human(int age, String name, boolean isEmployed){
        this.age = age;
        this.name = name;
        this.isEmployed = isEmployed;
    }
    public abstract void showInfo();

    public void introduce(){
        System.out.println("Hello, my name is " + name);
    }

    public String getInfo() {
        return "name: " + name + ", Age: " + age;
    }
    public int getAge(){ return age; }
    public void setAge(int age) { this.age= age; }

    public String getName(){ return name; }
    public void setName(String name) { this.name = name; }

    public boolean isEmployed(){ return isEmployed; }
    public void setEmployed(boolean employed) { isEmployed= employed; }
}
