package src.main.java.com.questsystem.main;

import src.main.java.com.questsystem.models.*;

public class Main {
    public static void main(String[] args) {
        
        Mentor gandalf = new Mentor("Gandalf", "the Grey");
        Mentor elrond = new Mentor("Elrond", "Lord of Rivendell");

        Quest destroyRing = new Quest("Destroy the One Ring", 10, gandalf);
        Quest defendHelmsDeep = new Quest("Defend Helm’s Deep", 8, elrond);

        Adventurer frodo = new Adventurer("Frodo Baggins", "Ring-bearer", "Hobbit");
        Adventurer aragorn = new Adventurer("Aragorn", "King of Gondor", "Man");
        Adventurer legolas = new Adventurer("Legolas", "Prince of the Woodland Realm", "Elf");
        Adventurer gimli = new Adventurer("Gimli", "Son of Gloin", "Dwarf");

        frodo.joinQuest(destroyRing);
        aragorn.joinQuest(defendHelmsDeep);
        legolas.joinQuest(defendHelmsDeep);
        gimli.joinQuest(defendHelmsDeep);

        System.out.println(destroyRing);
        System.out.println(defendHelmsDeep);

        System.out.println("\nAdventurers in 'Defend Helm’s Deep':");
        for (Adventurer a : defendHelmsDeep.getAdventurers()) {
            System.out.println("- " + a);
        }

        System.out.println("\nQuests taken by Frodo:");
        for (Quest q : frodo.getQuests()) {
            System.out.println("- " + q);
        }
    }
}