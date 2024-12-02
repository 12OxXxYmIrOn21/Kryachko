// Определяем абстракцию
abstract class DataEncryption {
    protected EncryptionAlgorithm algorithm;

    protected DataEncryption(EncryptionAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public abstract String encryptData(String data);
    public abstract String decryptData(String data);
}