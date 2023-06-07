package HashTable;

public class Main {
    public static void main(String[] args) throws Exception {
        Hash table = new Hash(10);
        table.put("name", "Nikita");
        table.put("age", "18");
        table.put("high", "175");
        table.put("born", "11.06.2004");
        table.put("addres", "MP");
        table.put("car", "Granta");
        table.put("city", "Voronezh");
        table.put("child", "none");

        System.out.println(table.get("xxx"));

        table.remove("addres");

        System.out.println(table.get("age"));
        System.out.println(table.get("name"));
    }
}
