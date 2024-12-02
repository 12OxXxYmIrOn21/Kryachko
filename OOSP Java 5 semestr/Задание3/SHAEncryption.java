//Реализация SHA
class SHAEncryption implements EncryptionAlgorithm {
    @Override
    public String encrypt(String data) {
        // Логика SHA (на самом деле это хэширование, а не шифрование)
        return "SHA Hashed Data: " + data.hashCode();
    }

    @Override
    public String decrypt(String data) {
        // SHA не может быть дешифрован, так что просто возвращаем null
        return null;
    }
}