package ru.Vsuet.mtx;

import java.util.function.Predicate;

public class ILinkedList implements IList {
    private Node head;
    private int size;

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    @Override
    public void add(int value) { //Добавляем новую ячейку со значением в список
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        size++;
    }

    @Override
    public void add(int key, int value) {
        if (key < 0 || key > size) {
            throw new IndexOutOfBoundsException("Элемент не найден:");
        }
        Node newNode = new Node(value);
        if (key == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node beforeNode = head;
            for (int i = 0; i < key; i++) {
                beforeNode = beforeNode.next;
            }
            newNode.next = beforeNode.next;
            beforeNode.next = newNode;
        }
        size++;
    }

    @Override
    public void remove(int key) {
        if (key < 0 || key >= size) {
            throw new IndexOutOfBoundsException("Элемент не найден:");
        }
        if (key == 0) {
            head = head.next;
        } else {
            Node beforeNode = head;
            for (int i = 0; i < key - 1; i++) {
                beforeNode = beforeNode.next;
            }
            beforeNode.next = beforeNode.next.next;
        }
        size--;
    }

    @Override
    public void remove(Predicate<Integer> predicate) {
        Node currentNode = head;
        Node prevNode = null;

        while (currentNode != null) {
            if (predicate.test(currentNode.value)) {
                if (prevNode != null) {
                    prevNode.next = currentNode.next;
                } else {
                    head = currentNode.next;
                }
                size--;
            } else {
                prevNode = currentNode;
            }
            currentNode = currentNode.next;
        }
    }

    @Override
    public int get(int key) {
        if (key < 0 || key >= size) {
            throw new IndexOutOfBoundsException("Элемент не найден:");
        }
        Node currentNode = head;
        for (int i = 0; i < key; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.value;
    }

    @Override
    public int size() {
        return size();
    }

}
