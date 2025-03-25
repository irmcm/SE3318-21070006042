package com.system;

import java.util.ArrayList;
import java.util.List;

public class Spellbook {
    List<Spell> spells = new ArrayList<>();


    public Spellbook(List<Spell> allSpells) {
        this.spells = allSpells;
    }

    public Spell getSpell(int index){
        if (index >= 0 && index < spells.size()) {
            return spells.get(index);
        }
        return null;
    }

    /**
     * Requires: index is valid
     * Effects: Returns the spell at given index
     */

     public List<Spell> getSpellsByPrefix(String prefix){

        List<Spell> spellsList = new ArrayList<>(spells);

        spellsList.removeIf(spell -> !spell.name.startsWith(prefix));

        return spellsList;
    }
    /**
     * Requires: prefix is not null
     * Effects: Returns a list of spells starting with the given prefix
     */
}
