package com.example.kata.adapter.ultraslowdatabase;

import com.example.kata.adapter.importer.NameRepository;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class VerySlowNameRepository implements NameRepository {

    private static final int TEN_SECONDS = 10 * 1000;
    private Set<String> names = new HashSet<>();

    public int size() {
        simulateSlowConnection();
        return names.size();
    }

    private static void simulateSlowConnection() {
        try {
            Thread.sleep(TEN_SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void add(String name) {
        simulateSlowConnection();
        names.add(name);
    }

    public Set<String> getAll() {
        simulateSlowConnection();
        return Collections.unmodifiableSet(names);

    }

    public void addAll(Set<String> names) {
        simulateSlowConnection();
        this.names.addAll(names);
    }
}
