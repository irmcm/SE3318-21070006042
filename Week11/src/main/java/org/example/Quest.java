package org.example;

/**
 * Represents a quest in the Lord of the Rings universe.
 */
public class Quest {

    private final String type;

    private final int difficultyLevel;
    
    private final String reward;

    /**
     * Constructs a new Quest.
     *
     * @param type            the type of quest (e.g., battle, stealth)
     * @param difficultyLevel difficulty level of the quest
     * @param reward          reward gained from completion
     */
    public Quest(final String type, final int difficultyLevel, final String reward) {
        this.type = type;
        this.difficultyLevel = difficultyLevel;
        this.reward = reward;
    }

    public void completeQuest(final int effort) {
        if (effort >= this.difficultyLevel * 10) {
            System.out.println("Quest completed! Reward: " + this.reward);
        } else {
            System.out.println("Quest failed. Try again!");
        }
    }

    public String getType() {
        return this.type;
    }

    public int getDifficultyLevel() {
        return this.difficultyLevel;
    }

    public String getReward() {
        return this.reward;
    }

    @Override
    public String toString() {
        return "Quest{" + "type='" + this.type + '\'' + ", difficulty=" + this.difficultyLevel
                + ", reward='" + this.reward + '\'' + '}';
    }
}

