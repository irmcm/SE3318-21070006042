package eldoriagame;

public class Mage extends Character implements Questable {
    private String spell;

    public Mage(String name, int level, String spell) {
        super(name, level);
        this.spell = spell;
    }

    @Override
    public void speak() {
        System.out.println("Ben bir büyücüyüm!");
    }

    @Override
    public void acceptQuest(String questName) {
        System.out.println(getName() + " " + questName + " görevini kabul etti.");
    }

    public String castSpell() {
        return getName() + " " + spell + " büyüsünü kullandı!";
    }
    
}