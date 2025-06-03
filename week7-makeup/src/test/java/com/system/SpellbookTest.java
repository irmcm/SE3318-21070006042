package com.system;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SpellbookTest {

    private Spellbook spellbook;

    @BeforeEach
    void setUp() {
        List<Spell> spellList = new ArrayList<>();
        spellList.add(new Spell("Alohomora"));
        spellList.add(new Spell("Accio"));
        spellList.add(new Spell("Lumos"));
        spellbook = new Spellbook(spellList);
    }

    @Test
    void testGetSpellValidIndex() {
        Spell result = spellbook.getSpell(0);
        assertEquals("Alohomora", result.name);
    }

    @Test
    void testGetSpellInvalidIndex() {
        assertNull(spellbook.getSpell(-1));
        assertNull(spellbook.getSpell(10));
    }

    @Test
    void testGetSpellsByPrefixExactMatch() {
        List<Spell> result = spellbook.getSpellsByPrefix("Alo");
        assertEquals(1, result.size());
        assertEquals("Alohomora", result.get(0).name);
    }

    @Test
    void testGetSpellsByPrefixEmptyPrefix() {
        List<Spell> result = spellbook.getSpellsByPrefix("");
        assertEquals(3, result.size()); // Hepsi döner
    }

    @Test
    void testGetSpellsByPrefixNoMatch() {
        List<Spell> result = spellbook.getSpellsByPrefix("Zzz");
        assertTrue(result.isEmpty());
    }
}
