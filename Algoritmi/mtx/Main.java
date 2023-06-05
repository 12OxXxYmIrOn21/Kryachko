package ru.Vsuet.mtx;

public class Main {
    public static void main(String[] args) {

        IList linkedList = new ILinkedList();
        linkedList.add(13434);
        linkedList.add(2542);
        linkedList.add(31243);
        linkedList.add(42134);
        linkedList.add(5565);
        linkedList.add(6778);
        linkedList.add(7111);
        linkedList.add(8900);
        linkedList.add(9999);
        System.out.println(linkedList.get(0)); //Выводим элемент с ключом 0 (1 элемент списка)
        linkedList.remove(2); //Удаляем элемент с ключом 2 и ставим на его место следющий за ним элемент (то есть 42134)
        System.out.println(linkedList.get(1)); //Выводим элемент с ключом 1
        System.out.println(linkedList.get(2)); //Выводим элемент с ключом 2 (Замененный элемент)
        System.out.println(linkedList.get(3)); //Выводим элемент с ключом 3


        System.out.println(linkedList);
    }

}
