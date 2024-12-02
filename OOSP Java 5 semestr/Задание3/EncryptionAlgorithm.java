//Определяем интерфейс имплементации
interface EncryptionAlgorithm {
    String encrypt(String data);
    String decrypt(String data);
}