package eldoriagame;

import java.util.ArrayList;
import java.util.List;

public class QuestBoard {
    private List<String> quests;

    public QuestBoard() {
        quests = new ArrayList<>();
    }
    
    public void addQuest(String quest) {
        quests.add(quest);
        System.out.println("Quest \"" + quest + "\" panoya eklendi.");
    }
    
    public void assignQuest(Questable character, String questName) {
        if(quests.contains(questName)) {
            // Questable karakterin aynı zamanda Character olduğunu varsayıyoruz.
            String characterName = ((Character) character).getName();
            System.out.println("Quest \"" + questName + "\" " + characterName + "'e atandı.");
            character.acceptQuest(questName);
        } else {
            System.out.println("Quest board'da \"" + questName + "\" bulunamadı.");
        }
    }
}