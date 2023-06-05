package HashTable;

import java.util.*;

public class Hash {
    private int TABLE_SIZE;
    private int size;
    private String[] keys;
    private String[] values;

    public Hash(int ts) {
        TABLE_SIZE = ts;
        size = 0;
        keys = new String[TABLE_SIZE];
        values = new String[TABLE_SIZE];
        Arrays.fill(keys, "");
        Arrays.fill(values, "");
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        size = 0;
        Arrays.fill(keys, "");
        Arrays.fill(values, "");
    }

    private int hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash * 31 + key.charAt(i)) % TABLE_SIZE;
        }
        return hash;
    }

    public void put(String key, String value) {
        int hash = hash(key);
        while (!keys[hash].equals("")) {
            if (keys[hash].equals(key)) {
                values[hash] = value;
                return;
            }
            hash = (hash + 1) % TABLE_SIZE;
        }
        keys[hash] = key;
        values[hash] = value;
        size++;
    }

    public String get(String key) {
        int hash = hash(key);
        while (!keys[hash].equals("")) {
            if (keys[hash].equals(key))
                return values[hash];
            hash = (hash + 1) % TABLE_SIZE;
        }
        return null;
    }

    public void remove(String key) {
        int hash = hash(key);
        while (!keys[hash].equals("")) {
            if (keys[hash].equals(key)) {
                keys[hash] = "";
                values[hash] = "";
                size--;
                return;
            }
            hash = (hash + 1) % TABLE_SIZE;
        }
    }

    public void add(String key, String value) {
        put(key, value);
    }

    public void delete(String key) {
        remove(key);
    }

    public String[] keys() {
        String[] arr = new String[size];
        int j = 0;
        for (int i = 0; i < TABLE_SIZE; i++) {
            if (!keys[i].equals("")) {
                arr[j] = keys[i];
                j++;
            }
        }
        Arrays.sort(arr);
        return arr;
    }
}
