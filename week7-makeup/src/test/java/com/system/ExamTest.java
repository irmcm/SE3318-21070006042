package com.system;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ExamTest {

    private Exam exam;
    private Spell spell1;
    private Spell spell2;
    private Spell spell3;
    private Student student;

    @BeforeEach
    void setUp() {
        spell1 = new Spell("Lumos");
        spell2 = new Spell("Accio");
        spell3 = new Spell("Alohomora");

        List<Spell> required = Arrays.asList(spell1, spell2, spell3);
        exam = new Exam(required);

        student = new Student("Hermione Granger", "Gryffindor", 5);
    }

    @Test
    void testPassWithOneSpellKnown() {
        student.learnSpell(spell2); // Sadece birini biliyor
        assertTrue(exam.pass(student));
    }

    @Test
    void testFailWithNoSpellsKnown() {
        assertFalse(exam.pass(student));
    }

    @Test
    void testEvaluatePassOutput() {
        student.learnSpell(spell1);

        // Konsol çıktısını test etmek için System.out'u geçici olarak yakalıyoruz
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        exam.evaluate(student);

        String expected = "Hermione Granger has passed the exam!" + System.lineSeparator();
        assertEquals(expected, outContent.toString());

        System.setOut(System.out); // geri resetle
    }

    @Test
    void testEvaluateFailOutput() {
        // Hiçbir büyü bilmiyor

        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        exam.evaluate(student);

        String expected = "Hermione Granger has failed the exam!" + System.lineSeparator();
        assertEquals(expected, outContent.toString());

        System.setOut(System.out); // geri resetle
    }
}
