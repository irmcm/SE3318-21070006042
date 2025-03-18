package src.main.java.com.questsystem.models;

import java.util.ArrayList;
import java.util.List;

public class Quest {
    private String name;
    private int difficulty;
    private Mentor mentor;
    private List<Adventurer> adventurers;

    public Quest(String name, int difficulty, Mentor mentor) {
        this.name = name;
        this.difficulty = difficulty;
        this.mentor = mentor;
        this.adventurers = new ArrayList<>();
        mentor.assignQuest(this);
    }

    public void addAdventurer(Adventurer adventurer) {
        adventurers.add(adventurer);
    }

    public List<Adventurer> getAdventurers() {
        return adventurers;
    }

    @Override
    public String toString() {
        return "Quest: " + name + " (Difficulty: " + difficulty + ") - Mentor: " + mentor;
    }
}