package org.test;

public class Shop {

    private Storage storage = new StorageImpl();

    public void add(String name, int count, double weight) {
        storage.add(name, count, weight);
    }

    public int countItems () {
        return storage.getAll().size() * 40;
    }
}
