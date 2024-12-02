//Реализация RSA
class RSAEncryption implements EncryptionAlgorithm {
    @Override
    public String encrypt(String data) {
        // Логика RSA шифрования
        return "RSA Encrypted Data: " + data;
    }

    @Override
    public String decrypt(String data) {
        return "RSA Decrypted Data: " + data.substring(20); // Убираем "RSA Encrypted Data: "
    }
}