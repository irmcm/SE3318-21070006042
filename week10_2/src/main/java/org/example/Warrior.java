package org.example;

/*
 * CHANGES & VIOLATIONS FIXED:
 * - Renamed method `special_Attack` → `specialAttack` (MethodName).
 * - Added Javadoc on class, constructor, and method (JavadocType, JavadocMethod).
 * - Ensured proper spacing and indentation (Indentation, EmptyLineSeparator).
 * - Applied `@Override` annotation properly.
 */

/**
 * Warrior character with strong melee attack.
 */
public class Warrior extends Character {

    /**
     * Constructs a new Warrior.
     *
     * @param name        name of the warrior
     * @param health      initial health
     * @param attackPower attack strength
     */
    public Warrior(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    /**
     * Warrior's special attack that deals double damage.
     *
     * @param opponent character being attacked
     */
    @Override
    public void specialAttack(Character opponent) {
        opponent.takeDamage(attackPower * 2);
    }
}