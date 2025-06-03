package com.system;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MagicClassroomTest {

    private MagicClassroom classroom;

    private Spell spell1;
    private Spell spell2;
    private Student student1;
    private Student student2;
    private Student student3;

    @BeforeEach
    void setUp() {
        classroom = new MagicClassroom();

        spell1 = new Spell("Lumos");
        spell2 = new Spell("Accio");

        student1 = new Student("Harry Potter", "Gryffindor", 5);
        student2 = new Student("Draco Malfoy", "Slytherin", 5);
        student3 = new Student("Luna Lovegood", "Ravenclaw", 5);

        student1.learnSpell(spell1);
        student2.learnSpell(spell2);
        student3.learnSpell(spell1); // Luna da Lumos biliyor

        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);
    }

    @Test
    void testAddValidStudent() {
        MagicClassroom newClassroom = new MagicClassroom();
        Student newStudent = new Student("Neville Longbottom", "Gryffindor", 5);
        newClassroom.addStudent(newStudent);

        assertEquals(newStudent, newClassroom.findStudent("Neville Longbottom"));
    }

    @Test
    void testAddNullStudent() {
        MagicClassroom newClassroom = new MagicClassroom();
        newClassroom.addStudent(null);

        assertNull(newClassroom.findStudent("Null Test"));
    }

    @Test
    void testFindStudentByName() {
        Student found = classroom.findStudent("Draco Malfoy");
        assertNotNull(found);
        assertEquals("Slytherin", found.getHouse());
    }

    @Test
    void testFindStudentBySpell() {
        Student found = classroom.findStudentBySpell(spell1);
        assertNotNull(found);
        assertTrue(found.knowsSpell(spell1));
    }

    @Test
    void testGetStudentsByHouse() {
        List<Student> gryffindors = classroom.getStudentsByHouse("Gryffindor");
        assertEquals(1, gryffindors.size());
        assertEquals("Harry Potter", gryffindors.get(0).getName());
    }

    @Test
    void testGetStudentsSortedByHouse() {
        List<Student> sorted = classroom.getStudentsSortedByHouse();
        assertEquals(3, sorted.size());
        assertEquals("Draco Malfoy", sorted.get(0).getName()); // Slytherin en sona gider
        assertEquals("Luna Lovegood", sorted.get(1).getName()); // Ravenclaw
        assertEquals("Harry Potter", sorted.get(2).getName()); // Gryffindor
    }
}
