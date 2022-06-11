package game;

public class Animal implements Unit{
    public String name;

    public Animal (String name){
        this.name = name;
    }

    public String getName() {
        System.out.println(name + " Animal");
        return name;
    }
}
