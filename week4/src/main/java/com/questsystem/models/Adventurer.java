package src.main.java.com.questsystem.models;

import src.main.java.com.questsystem.interfaces.Joinable;
import java.util.ArrayList;
import java.util.List;

public class Adventurer extends Character implements Joinable {
    private String race;
    private List<Quest> quests;

    public Adventurer(String name, String title, String race) {
        super(name, title);
        this.race = race;
        this.quests = new ArrayList<>();
    }

    @Override
    public void joinQuest(Quest quest) {
        quests.add(quest);
        quest.addAdventurer(this);
    }

    public List<Quest> getQuests() {
        return quests;
    }

    @Override
    public String toString() {
        return name + " the " + title + " (" + race + ")";
    }
}
