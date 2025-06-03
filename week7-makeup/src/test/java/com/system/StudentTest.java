package com.system;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {


    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student("Hermione Granger", "Gryffindor", 3);
    }

    @Test
    public void testLearnValidSpell() {
        Spell spell = new Spell("Lumos");
        assertTrue(student.learnSpell(spell));
    }

    @Test
    public void testLearnNullSpell() {
        assertFalse(student.learnSpell(null));
    }

    @Test
    public void testLearnDuplicateSpell() {
        Spell spell = new Spell("Accio");
        student.learnSpell(spell);
        assertFalse(student.learnSpell(spell)); // aynı büyüyü 2 kez öğrenemez
    }

    @Test
    public void testKnowsSpell() {
        Spell knownSpell = new Spell("Alohomora");
        Spell unknownSpell = new Spell("Avada Kedavra");

        student.learnSpell(knownSpell);

        assertTrue(student.knowsSpell(knownSpell));
        assertFalse(student.knowsSpell(unknownSpell));
    }
}