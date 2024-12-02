public class Main {
    public static void main(String[] args) {
        // Пример использования
        EncryptionAlgorithm aes = new AESEncryption();
        DataEncryption secureDataAES = new SecureData(aes);

        String aesEncrypted = secureDataAES.encryptData("Hello World");
        System.out.println(aesEncrypted);
        System.out.println(secureDataAES.decryptData(aesEncrypted));

        EncryptionAlgorithm rsa = new RSAEncryption();
        DataEncryption secureDataRSA = new SecureData(rsa);

        String rsaEncrypted = secureDataRSA.encryptData("Hello World");
        System.out.println(rsaEncrypted);
        System.out.println(secureDataRSA.decryptData(rsaEncrypted));

        EncryptionAlgorithm sha = new SHAEncryption();
        DataEncryption secureDataSHA = new SecureData(sha);

        String shaEncrypted = secureDataSHA.encryptData("Hello World");
        System.out.println(shaEncrypted);
        // SHA не имеет возможности дешифрования
        System.out.println(secureDataSHA.decryptData(shaEncrypted)); // null
    }
}

