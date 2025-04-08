package eldoriagame;

public class Main {
    public static void main(String[] args) {
        // Kahraman ve düşman oluşturuluyor
        Hero hero = new Hero("Aragorn", 10);
        Enemy enemy = new Enemy("Ork", 8);
        
        // Karakterler kendileriyle ilgili mesaj veriyor
        hero.speak();
        enemy.speak();
        
        // Savaş simülasyonu
        BattleManager battleManager = new BattleManager();
        battleManager.simulateBattle(hero, enemy);

        // Not: QuestBoard ile etkileşim için, ilerleyen safhalarda
        // Mage ve Warrior gibi Questable implement eden sınıflar eklenecek.
    }
}
