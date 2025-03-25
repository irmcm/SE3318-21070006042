package com.system;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List; 

public class MagicClassroom {
    private List<Student> students;

    public MagicClassroom() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (student != null) {
            students.add(student);
        }
    }
    /**
     * Requires: student is not null
     * Effects: Adds student to studentList if it is valid
     */

    public Student findStudent(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }
    /**
     * Requires: student is not null
     * Effects: Finds the student at the studentList
     */

    public Student findStudentBySpell(Spell spell){
        for (Student student : students){
            if(student.knowsSpell(spell))
                return student;
        }

        return null;
    }
    /**
     * requires: spell is not null
     * effects: Adds student to studentList if finds the student who knows the spell
     */

    public List<Student> getStudentsByHouse(String house) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getHouse().equals(house)) {
                result.add(student);
            }
        }
        return result;
    }
    /**
     * requires: house can not be null
     * effects: Adds student to studentList if it is valid
     */

     public List<Student> getStudentsSortedByHouse() {
        students.sort(Comparator.comparing(Student::getHouse));
        return students;
    }
    /**
     * requires: spell is not null
     * effects: students listed according to their houses
     */

}
