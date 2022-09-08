package com.company;

public class Cat {
    public int id;
    public String name;

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        Cat cat= (Cat) obj;
        return cat.name.equals(this.name);
    }
}
