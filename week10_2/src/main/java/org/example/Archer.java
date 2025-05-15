package org.example;

/*
 * CHANGES & VIOLATIONS FIXED:
 * - Renamed method `special_Attack` → `specialAttack` (MethodName).
 * - Added Javadoc on class, constructor, and method (JavadocType, JavadocMethod).
 * - Ensured proper formatting and spacing (Indentation).
 */

/**
 * Archer character with precision attack.
 */
public class Archer extends Character {

    /**
     * Constructs a new Archer.
     *
     * @param name        name of the archer
     * @param health      initial health
     * @param attackPower base attack power
     */
    public Archer(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    /**
     * Archer's special attack with added damage.
     *
     * @param opponent character being attacked
     */
    @Override
    public void specialAttack(Character opponent) {
        opponent.takeDamage(attackPower + 20);
    }
}