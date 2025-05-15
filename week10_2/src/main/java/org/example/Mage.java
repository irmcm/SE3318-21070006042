package org.example;

/*
 * CHANGES & VIOLATIONS FIXED:
 * - Renamed method `special_Attack` → `specialAttack` (MethodName).
 * - Added Javadoc on class, constructor, and method (JavadocType, JavadocMethod).
 * - Proper indentation and spacing applied (Indentation).
 */

/**
 * Mage character with powerful magical attack.
 */
public class Mage extends Character {

    /**
     * Constructs a new Mage.
     *
     * @param name        name of the mage
     * @param health      initial health
     * @param attackPower base attack power
     */
    public Mage(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    /**
     * Mage's special attack with additional magic power.
     *
     * @param opponent character being attacked
     */
    @Override
    public void specialAttack(Character opponent) {
        opponent.takeDamage(attackPower + 50);
    }
}
