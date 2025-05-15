package org.example;

import java.util.ArrayList;
import java.util.List;

/*
 * CHANGES & VIOLATIONS FIXED:
 * - Method `StartGame()` → `startGame()` (MethodName).
 * - Added full Javadoc on class and methods (JavadocType, JavadocMethod).
 * - EmptyLineSeparator added before methods.
 * - Braces added to all control structures (NeedBraces).
 * - Replaced local `gameOver` with call to `isGameOver()` for better abstraction.
 * - Used consistent naming and spacing (Indentation, WhitespaceAround).
 */

/**
 * Game class that handles the battle flow.
 */
public class Game {

    /** List of characters participating in the game. */
    private List<Character> characters = new ArrayList<>();

    /**
     * Adds a new character to the game.
     *
     * @param character the character to be added
     */
    public void addCharacter(Character character) {
        characters.add(character);
    }

    /**
     * Starts the battle simulation.
     */
    public void startGame() {
        int turn = 0;

        while (!isGameOver()) {
            Character attacker = characters.get(turn % characters.size());
            Character defender = characters.get((turn + 1) % characters.size());

            attacker.specialAttack(defender);
            System.out.println(attacker.getName() + " attacks " + defender.getName());

            if (defender.isDefeated()) {
                System.out.println(defender.getName() + " is defeated!");
            }

            turn++;
        }
    }

    /**
     * Checks if any character is defeated.
     *
     * @return true if any character is defeated
     */
    private boolean isGameOver() {
        for (Character character : characters) {
            if (character.isDefeated()) {
                return true;
            }
        }
        return false;
    }
}

