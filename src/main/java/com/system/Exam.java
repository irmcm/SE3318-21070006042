package com.system;

import java.util.List;
import java.util.ArrayList;

public class Exam {
    private List<Spell> requiredSpells;

    public Exam(List<Spell> requiredSpells) {
        this.requiredSpells = requiredSpells;
    }

     /**
     * Requires: student must not be null.
     * Effects: Returns true if the student knows all the required spells for the exam.
     */
    public boolean pass(Student student) {
        List<Spell> studentSpells = new ArrayList<>(student.getSpellsLearned());
        
        // Öğrencinin öğrenmesi gereken büyülerden en az birini öğrenip öğrenmediğini kontrol ediyoruz
        for (Spell requiredSpell : requiredSpells) {
            for (Spell learnedSpell : studentSpells) {
                if (learnedSpell.getName().equals(requiredSpell.getName())) {
                    return true; // Eğer en az birini biliyorsa geçer
                }
            }
        }
        return false; // Hiçbirini bilmiyorsa geçemez
    }


    /**
     * Requires: student must not be null.
     * Effects: Prints a message stating whether the student passed or failed the exam.
     */
    public void evaluate(Student student) {
        if (pass(student)) {
            System.out.println(student.getName() + " has passed the exam!");
        } else {
            System.out.println(student.getName() + " has failed the exam!");
        }
    }
}
