//Конкретная абстракция
class SecureData extends DataEncryption {
    public SecureData(EncryptionAlgorithm algorithm) {
        super(algorithm);
    }

    @Override
    public String encryptData(String data) {
        return algorithm.encrypt(data);
    }

    @Override
    public String decryptData(String data) {
        return algorithm.decrypt(data);
    }
}