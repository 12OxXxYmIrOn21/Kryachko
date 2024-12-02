// Реализация AES
class AESEncryption implements EncryptionAlgorithm {
    @Override
    public String encrypt(String data) {
        // Логика AES шифрования
        // Здесь просто возвращаем строку как пример
        return "AES Encrypted Data: " + data;
    }

    @Override
    public String decrypt(String data) {
        // Логика AES дешифрования
        return "AES Decrypted Data: " + data.substring(20); // Убираем "AES Encrypted Data: "
    }
}