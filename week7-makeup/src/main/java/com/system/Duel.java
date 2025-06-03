package com.system;
import java.util.Random;

public class Duel {
    /**
     * Starts a magical duel between two students using the given spell.
     * @requires s1 != null && s2 != null && spell != null && !spell.isEmpty()
     * @effects Determines the winner of the duel based on spell knowledge and magic strength.
     */
    public static void start(Student s1, Student s2, String spell) {
        // Requires: Both students must exist.
        // Effects: Duel outcome is printed based on spell knowledge.

        Spell spellObj = new Spell(spell);
        boolean knowsS1 = s1.knowsSpell(spellObj);
        boolean knowsS2 = s2.knowsSpell(spellObj);

        if (!knowsS1 && !knowsS2) {
            System.out.println("It's a draw! Neither wizard knows " + spell + ".");
        } else if (knowsS1 && !knowsS2) {
            System.out.println(s1.getName() + " wins! " + s1.getName() + " knows " + spell + " and " + s2.getName() + " doesn't.");
        } else if (!knowsS1 && knowsS2) {
            System.out.println(s2.getName() + " wins! " + s2.getName() + " knows " + spell + " and " + s1.getName() + " doesn't.");
        } else {
            // If both know the spell, decide based on random magic strength
            Random random = new Random();
            int magicStrength1 = random.nextInt(100);
            int magicStrength2 = random.nextInt(100);

            System.out.println("Both wizards know " + spell + ".");
            if (magicStrength1 > magicStrength2) {
                System.out.println(s1.getName() + " wins with a stronger magic!");
            } else if (magicStrength1 < magicStrength2) {
                System.out.println(s2.getName() + " wins with a stronger magic!");
            } else {
                System.out.println("It's a tie! Both wizards have the same magic strength.");
            }
        }
    }
}
