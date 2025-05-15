package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * - Damage calculation and attack logic
 * - Game winner detection
 * - Edge case: overkill and zero damage
 * - Basic round execution
 */

/**
 * Smoke test suite for core battle functionality.
 */
public class BattleSmokeTest {

    private Archer archer;
    private Mage mage;
    private Warrior warrior;

    @BeforeEach
    public void initializeCharacters() {
        archer = new Archer("Robin", 90, 12);
        mage = new Mage("Zelda", 70, 15);
        warrior = new Warrior("Thor", 110, 18);
    }

    @Test
    public void archerDealsExpectedDamage() {
        int initial = warrior.getHealth();
        archer.specialAttack(warrior);
        assertEquals(initial - 32, warrior.getHealth()); // 12 + 20
    }

    @Test
    public void mageCannotOverkillBeyondZero() {
        warrior.receiveDamage(110);
        assertTrue(warrior.isDefeated());
        mage.specialAttack(warrior);
        assertEquals(0, warrior.getHealth());
    }

    @Test
    public void warriorAttackDoublesPower() {
        int initial = mage.getHealth();
        warrior.specialAttack(mage);
        assertEquals(initial - 36, mage.getHealth()); // 18 * 2
    }

    @Test
    public void charactersAreMarkedDefeatedCorrectly() {
        mage.receiveDamage(70);
        assertTrue(mage.isDefeated());

        archer.receiveDamage(50);
        assertFalse(archer.isDefeated());
    }

    @Test
    public void gameDeclaresAWinnerEventually() {
        Game game = new Game();
        game.addCharacter(warrior);
        game.addCharacter(mage);

        int maxRounds = 100;
        int current = 0;

        while (game.getWinner() == null && current < maxRounds) {
            game.round();
            current++;
        }

        assertNotNull(game.getWinner());
    }
}
