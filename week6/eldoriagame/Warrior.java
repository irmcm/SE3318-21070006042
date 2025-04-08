public class Warrior extends Hero implements Questable {
    public Warrior(String name, int level) {
        super(name, level);
    }

    public void speak() {
        System.out.println("I am " + this.name + ", a fierce warrior of level " + this.level + "!");
    }

    public void acceptQuest(String questName) {
        System.out.println(this.name + " the warrior has accepted the quest: " + questName);
    }

    public void attack() {
        System.out.println(this.name + " attacks with a mighty blow!");
    }
}