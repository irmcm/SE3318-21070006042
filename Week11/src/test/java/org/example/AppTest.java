package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Smoke test for Lord of the Rings simulation project.
 */
public class AppTest {

    @Test
    public void testCharacterCreation() {
        Character gimli = new Character("Gimli", "Dwarf", 120, "Axe Warrior");
        assertEquals("Gimli", gimli.getName());
        assertEquals("Dwarf", gimli.getRace());
        assertEquals(120, gimli.getAge());
        assertEquals("Axe Warrior", gimli.getUniqueAttribute());
    }

    @Test
    public void testQuestSuccess() {
        Quest quest = new Quest("Battle", 4, "Victory Medal");
        quest.completeQuest(50); // Should succeed
    }

    @Test
    public void testMapPath() {
        MiddleEarthMap map = new MiddleEarthMap();
        assertEquals("Lothlorien", map.getNextLocation("Moria"));
    }
}
