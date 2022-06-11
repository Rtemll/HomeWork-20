package game;

public class Humanoid implements Unit{

    public String name;
//    public Weapon weapon;

    public Humanoid(String name){
        this.name = name;
//        this.weapon = weapon;

    }
    public String getName() {
        System.out.println(name + " Humanoid");
        return name;
    }
}
