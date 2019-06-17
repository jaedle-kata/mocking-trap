package com.example.kata.adapter.ultraslowdatabase;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class NameRepositoryTest {
    @Test
    public void isInitiallyEmpty() {
        NameRepository nameRepository = new NameRepository();
        assertEquals(0, nameRepository.size());
        assertEquals(Collections.emptySet(), nameRepository.getAll());
    }

    @Test
    public void addOneNameAtATime() {
        NameRepository nameRepository = new NameRepository();

        nameRepository.add("John");
        nameRepository.add("Ben");

        assertEquals(2, nameRepository.size());
        assertEquals(new HashSet<>(Arrays.asList("John", "Ben")), nameRepository.getAll());
    }

    @Test
    public void addMultipleNameAtATime() {
        NameRepository nameRepository = new NameRepository();

        nameRepository.addAll(new HashSet<>(Arrays.asList("John", "Ben")));
        nameRepository.addAll(new HashSet<>(Arrays.asList("Adam", "Sven")));

        assertEquals(4, nameRepository.size());
        assertEquals(new HashSet<>(Arrays.asList("John", "Ben", "Adam", "Sven")), nameRepository.getAll());
    }

    @Test
    public void isUnique() {
        NameRepository nameRepository = new NameRepository();

        nameRepository.add("John");
        nameRepository.add("John");
        nameRepository.add("John");
        nameRepository.add("John");

        assertEquals(1, nameRepository.size());
        assertEquals(new HashSet<>(Arrays.asList("John")), nameRepository.getAll());
    }
}
