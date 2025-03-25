package com.system;

import java.util.HashSet;
import java.util.Set;

public class Student {
    private String name;
    private String house;
    private int year;
    private Set<Spell> spellsLearned;

    public Student(String name, String house, int year) {
        this.name = name;
        this.house = house;
        this.year = year;
        this.spellsLearned = new HashSet<>();
    }

    public boolean learnSpell(Spell spell) {
        if (spell != null && !spellsLearned.contains(spell)) {
            spellsLearned.add(spell);
            return true;
        }
        return false;
    }

    /**
     * @return true if spell is learnt false otherwise
     * Requires: spell is not null
     * Effects: Adds spell if not already known
     */

    public boolean knowsSpell(Spell spell) {
        return spellsLearned.contains(spell);
    }

    /**
     * @return true if spell is known, false otherwise
     * Requires: spell is not null
     * Effects: Returns true if student knows the spell
     */

    public String getName() { return name; }
    public String getHouse() { return house; }
    public int getYear() { return year; }
    public Set<Spell> getSpellsLearned() { return spellsLearned; }

    @Override
    public String toString() {
        return name + " (" + house + ", Year: " + year + ")";
    }
}
