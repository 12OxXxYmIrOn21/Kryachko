package ru.Vsuet.mtx;

import java.util.function.Predicate;

public interface IList {

    /**
     * adds value into list tail
     * */
    void add(int value);

    /**
     * adds value into list by index
     * @param key
     * @param value
     */
    void add(int key, int value);

    /**
     * removes element by index
     * @param key
     */
    void remove(int key);

    /**
     * removes element by condition
     * @param predicate
     */
    void remove(Predicate<Integer> predicate);

    /**
     * returns element by index
     * @param key
     * @return
     */
    int get(int key);
    int size ();
}
