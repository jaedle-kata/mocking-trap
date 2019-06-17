package com.example.kata.adapter.ultraslowdatabase;

import java.util.*;

public class NameRepository {

    private Set<String> names = new HashSet<>();

    public int size() {
        return names.size();
    }

    public void add(String name) {
        names.add(name);
    }

    public Set<String> getAll() {
        return Collections.unmodifiableSet(names);
    }

    public void addAll(Set<String> names) {
        this.names.addAll(names);
    }
}
