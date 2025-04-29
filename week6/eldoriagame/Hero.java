package eldoriagame;

public class Hero extends Character {

    public Hero(String name, int level) {
        super(name, level);
    }
    
    @Override
    public void speak() {
        System.out.println("Ben kahramanım!");
    }
}
