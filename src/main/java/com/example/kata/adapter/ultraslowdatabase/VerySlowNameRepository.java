package com.example.kata.adapter.ultraslowdatabase;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class VerySlowNameRepository implements NameRepository {

    private Set<String> names = new HashSet<>();

    @Override
    public int size() {
        simulateSlowConnection();
        return names.size();
    }

    private static void simulateSlowConnection() {
        try {
            Thread.sleep(10 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void add(String name) {
        simulateSlowConnection();
        names.add(name);
    }

    @Override
    public Set<String> getAll() {
        simulateSlowConnection();
        return Collections.unmodifiableSet(names);

    }

    @Override
    public void addAll(Set<String> names) {
        simulateSlowConnection();
        this.names.addAll(names);
    }
}
