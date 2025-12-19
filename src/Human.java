package org.example;

public class Human {
    private int age;
    private String name;
    private boolean isEighteen;

    public Human(int age, String name, boolean isEighteen){
        this.age = age;
        this.name = name;
        this.isEighteen = isEighteen;
    }
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

    public boolean isEighteen(){ return isEighteen; }
    public void setEighteen(boolean eighteen) { isEighteen= eighteen; }
}
