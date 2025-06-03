package com.system;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DuelTest {

    private Student harry;
    private Student draco;
    private String spellName = "Expelliarmus";

    @BeforeEach
    void setUp() {
        harry = new Student("Harry Potter", "Gryffindor", 5);
        draco = new Student("Draco Malfoy", "Slytherin", 5);
    }

    private String captureDuelOutput(Student s1, Student s2, String spell) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        try {
            Duel.start(s1, s2, spell);
        } catch (Exception e) {
            return "Exception: " + e.getMessage();
        } finally {
            System.setOut(System.out); // reset output
        }
        return outContent.toString();
    }

    @Test
    void testBothKnowSpell() {
        harry.learnSpell(new Spell(spellName));
        draco.learnSpell(new Spell(spellName));

        String output = captureDuelOutput(harry, draco, spellName);
        assertTrue(output.contains("Both wizards know " + spellName + "."));
    }

    @Test
    void testOneKnowsSpell() {
        harry.learnSpell(new Spell(spellName));

        String output = captureDuelOutput(harry, draco, spellName);
        assertTrue(output.contains("Harry Potter wins!"));
    }

    @Test
    void testNeitherKnowsSpell() {
        String output = captureDuelOutput(harry, draco, spellName);
        assertTrue(output.contains("It's a draw!"));
    }

    @Test
    void testNullStudentOrSpell() {
        String out1 = captureDuelOutput(null, draco, spellName);
        assertTrue(out1.startsWith("Exception"));

        String out2 = captureDuelOutput(harry, null, spellName);
        assertTrue(out2.startsWith("Exception"));

        String out3 = captureDuelOutput(harry, draco, null);
        assertTrue(out3.startsWith("Exception"));
    }
}
