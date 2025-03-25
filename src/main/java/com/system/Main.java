package com.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Student harry = new Student("Harry Potter", "Gryffindor", 2000);
        Student hermione = new Student("Hermione Granger", "Gryffindor", 1999);
        Student ron = new Student("Ron Weasley", "Gryffindor", 2000);
        Student draco = new Student("Draco Malfoy", "Slytherin", 2000);

        Spell expelliarmus = new Spell("Expelliarmus");
        Spell lumos = new Spell("Lumos");
        Spell avadaKedavra = new Spell("Avada Kedavra");

        System.out.println(harry.getName() + " is learning Expelliarmus: " + harry.learnSpell(expelliarmus));
        System.out.println(hermione.getName() + " is learning Lumos: " + hermione.learnSpell(lumos));
        System.out.println(ron.getName() + " is learning Expelliarmus: " + ron.learnSpell(expelliarmus));
        System.out.println(draco.getName() + " is learning Avada Kedavra: " + draco.learnSpell(avadaKedavra));

        List<Spell> allSpells = new ArrayList<>();
        allSpells.add(expelliarmus);
        allSpells.add(lumos);
        allSpells.add(avadaKedavra);

        Spellbook spellbook = new Spellbook(allSpells);
        System.out.println("Spells starting with 'Av': " + spellbook.getSpellsByPrefix("Av"));

        Exam exam = new Exam(allSpells);
        List<Student> students = new ArrayList<>();
        students.add(harry);
        students.add(hermione);
        students.add(ron);
        students.add(draco);

        for (Student student : students) {
            if (exam.pass(student)) {
                System.out.println(student.getName() + " passed the exam!");
            } else {
                System.out.println(student.getName() + " failed the exam!");
            }
        }

        Duel.start(harry, hermione, "Expelliarmus");
        Duel.start(ron, draco, "Avada Kedavra");
    }
}
