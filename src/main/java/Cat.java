package main.java;

public class Cat {
    public String name;
    private int age;
    public void meow(){
        System.out.println("Meow!");
    }
    public int getAge() {
        return age;
    }
    public Cat (String name, int age) {
        this.name=name;
        this.age=age;
    }
    public int createCatAndGetAge() {
        Cat exampleCat=new Cat("Nance", 2);
        return exampleCat.getAge();

    }

}


