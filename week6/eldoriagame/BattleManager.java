package eldoriagame;

public class BattleManager {
    public void simulateBattle(Hero hero, Enemy enemy) {
        System.out.println("\n" + hero.getName() + " ile " + enemy.getName() + " arasında savaş başlıyor!");
        
        if(hero.getLevel() >= enemy.getLevel()) {
            System.out.println(hero.getName() + " " + enemy.getName() + "'i yendi!");
        } else {
            System.out.println(enemy.getName() + " " + hero.getName() + "'ı yendi!");
        }
    }
}
