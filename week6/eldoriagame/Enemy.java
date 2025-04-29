package eldoriagame;

public class Enemy extends Character {

    public Enemy(String name, int level) {
        super(name, level);
    }
    
    @Override
    public void speak() {
        System.out.println("Ben düşmanım!");
    }
}
