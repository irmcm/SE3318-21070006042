package org.example;

/**
 * Represents a character in the Lord of the Rings universe.
 * Each character has a name, race, age, and a unique attribute.
 *
 * @author YourName
 */
public class Character {

    private final String name;

    private final String race;

    private final int age;
    
    private final String uniqueAttribute;

    /**
     * Constructs a Character with the given properties.
     *
     * @param name            the name of the character
     * @param race            the race of the character
     * @param age             the age of the character
     * @param uniqueAttribute the unique attribute (e.g., weapon, title)
     */
    public Character(final String name, final String race, final int age, final String uniqueAttribute) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.uniqueAttribute = uniqueAttribute;
    }

    /**
     * Gets the name of the character.
     *
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the race of the character.
     *
     * @return the race
     */
    public String getRace() {
        return this.race;
    }

    /**
     * Gets the age of the character.
     *
     * @return the age
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Gets the unique attribute of the character.
     *
     * @return the unique attribute
     */
    public String getUniqueAttribute() {
        return this.uniqueAttribute;
    }

    /**
    * Prints the character's details.
    */
    public void printDetails() {
    System.out.println(this.toString());
    }

    /**
     * Returns a string representation of the character.
     *
     * @return formatted string with character details
     */
    @Override
    public String toString() {
        return this.name + " (" + this.race + "), Age: "
                + this.age + ", Attribute: " + this.uniqueAttribute;
    }
}