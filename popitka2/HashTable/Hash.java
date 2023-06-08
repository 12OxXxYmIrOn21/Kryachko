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
        keys = new String[TABLE_SIZE]; // Создаем максимальное кол-во возможных ключей равных размеру хэш таблицы
        values = new String[TABLE_SIZE]; // Создаем максимальное кол-во возможных значений равных размеру хэш таблицы
        Arrays.fill(keys, ""); //Заполняем ключи одинаковым значением
        Arrays.fill(values, "");//Заполняем values одинаковыми значениями
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        size = 0;
        Arrays.fill(keys, ""); //Очищаем улючи хэщ таблицы
        Arrays.fill(values, ""); //Очищаем значения хэщ таблицы
    }

    private int hash(String key) { //Преобразуем ключ в свой хэш
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash * 31 + key.charAt(i)) % TABLE_SIZE; // Формируем хэш по ключу
        }
        return hash;
    }

    public void put(String key, String value) { //Кладем в ключ свое значение
        int hash = hash(key);
        while (!keys[hash].equals("")) { //пока ключ не пустой
            if (keys[hash].equals(key)) { //если ключ свопадает с ключом по хэшу
                values[hash] = value; //хэш значения равен значению
                return;
            }
            hash = (hash + 1) % TABLE_SIZE;
        }
        keys[hash] = key;
        values[hash] = value;
        size++;
    }

    public String get(String key) { //Вытаскиваем значение по ключу
        int hash = hash(key);
        while (!keys[hash].equals("")) { //Пока ключ совпадает с "" выполняется
            if (keys[hash].equals(key)) //Если Преобразованный ключ совпадает с ключом в таблице
                return values[hash]; // Возвращаем значение к которому был присвоен ключ
            hash = (hash + 1) % TABLE_SIZE; //Находим остаток
        }
        return null; //Если ключ и хэш не свопадают возвращаем null
    }

    public void remove(String key) { //Уаление элемента
        int hash = hash(key);
        while (!keys[hash].equals("")) { //Пока хэш не равен null
            if (keys[hash].equals(key)) { // Если хэш по ключу совпадает с введённым ключом
                keys[hash] = ""; //Обнуляем ключ
                values[hash] = "";//Обнуляем значение
                size--; //Уменьшаем размер таблицы
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
