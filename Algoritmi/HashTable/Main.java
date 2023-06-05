package HashTable;

public class Main {
    public static void main(String[] args) throws Exception {
        Hash table = new Hash(10);
        table.put("key1", "value1");
        table.put("key2", "value2");
        table.put("key3", "value3");
        table.put("key4", "value4");

        System.out.println(table.get("key1"));

        table.remove("key4");

        System.out.println(table.get("key2"));
        System.out.println(table.get("key3"));
    }
}
