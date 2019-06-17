package com.example.kata.adapter.importer;

import java.util.Set;

public interface NameRepository {

    int size();
    void add(String name);
    void addAll(Set<String> names);
    Set<String> getAll();
}
