package org.example;

/*
 * CHANGES & VIOLATIONS FIXED:
 * - Method order and formatting corrected (Indentation, EmptyLineSeparator).
 * - Class and method now include Javadoc (JavadocType, JavadocMethod).
 */

/**
 * Entry point of the Character Battle game.
 */
public class Main {

    /**
     * Main method to start the game.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Game game = new Game();

        game.addCharacter(new Warrior("Conan", 100, 15));
        game.addCharacter(new Mage("Merlin", 80, 20));
        game.addCharacter(new Archer("Legolas", 90, 18));

        game.startGame();
    }
}