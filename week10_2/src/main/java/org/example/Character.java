package org.example;

/*
 * CHANGES & VIOLATIONS FIXED:
 * - Method name changed: `special_Attack` → `specialAttack` (MethodName).
 * - Added complete Javadoc on class, fields, and all public methods (JavadocType, JavadocMethod, JavadocVariable).
 * - Added braces to all if blocks (NeedBraces).
 * - Formatted with 4-space indentation and added empty lines between members (Indentation, EmptyLineSeparator).
 * - Improved null-check for name (Defensive programming, ParameterName).
 */

/**
 * Abstract class for all game characters.
 */
public abstract class Character {

    /** Name of the character. */
    protected String name;

    /** Current health of the character. */
    protected int health;

    /** Attack power of the character. */
    protected int attackPower;

    /**
     * Constructs a new Character.
     *
     * @param name        character name (non-null)
     * @param health      initial health (≥ 0)
     * @param attackPower attack strength (≥ 0)
     * @throws IllegalArgumentException if health or attackPower is negative
     */
    public Character(String name, int health, int attackPower) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be null or blank.");
        }

        if (health < 0 || attackPower < 0) {
            throw new IllegalArgumentException("Health and attack power must be non-negative.");
        }

        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    /**
     * Gets the name of the character.
     *
     * @return character's name
     */
    public String getName() {
        if (name != null) {
            return name;
        } else {
            return "Unknown";
        }
    }

    /**
     * Gets the character's current health.
     *
     * @return health value
     */
    public int getHealth() {
        return health;
    }

    /**
     * Reduces the character's health by the given damage amount.
     *
     * @param damage damage to apply (≥ 0)
     */
    public void takeDamage(int damage) {
        if (damage < 0) {
            throw new IllegalArgumentException("Damage must be non-negative.");
        }

        health = Math.max(0, health - damage);
    }

    /**
     * Checks whether the character is defeated.
     *
     * @return true if health ≤ 0, false otherwise
     */
    public boolean isDefeated() {
        if (health <= 0) {
            return true;
        }

        return false;
    }

    /**
     * Executes a special attack on the opponent.
     *
     * @param opponent target character to attack
     */
    public abstract void specialAttack(Character opponent);

    /**
     * A placeholder for complex logic examples.
     */
    public void complexMethodExample() {
        // Intentionally left blank for demonstration
    }
}