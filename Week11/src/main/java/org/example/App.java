package org.example;

/**
 * Entry point for the Lord of the Rings simulation project.
 * This class creates characters, initiates a quest, and navigates the map.
 */
public class App {

    /**
     * Main method to run the simulation.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(final String[] args) {
        createCharacters();
        navigateMap();
        runQuest();
    }

    private static void createCharacters() {
        Character frodo = new Character("Frodo", "Hobbit", 50, "Ring Bearer");
        frodo.printDetails();

        Character aragorn = new Character("Aragorn", "Human", 80, "Sword Master");
        aragorn.printDetails();

    }

    private static void navigateMap() {
        MiddleEarthMap map = new MiddleEarthMap();
        map.navigate("Shire");
        map.navigate("Rivendell");
    }

    private static void runQuest() {
        Quest quest = new Quest("Destroy the Ring", 5, "Peace in Middle-Earth");
        quest.completeQuest(100);
    }
}
