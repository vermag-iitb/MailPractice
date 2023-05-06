import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import javax.crypto.Cipher;
import java.security.Signature;

        //--------------------Case 2: -------------------------

//        Signature sign = Signature.getInstance("SHA256withRSA");
//
//        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
//
//        keyPairGen.initialize(2048);
//
//        KeyPair pair = keyPairGen.generateKeyPair();
//
//        PublicKey publicKey = pair.getPublic();
//
//        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
//
//        String cipherText = "%X�3��l\u001C���\u0010�0k���a殱V\u000F�\u0018�Q�*\u2067a�m�7�*,�Q��\u0016�z�\\\u0013��Ta�V�S*$�4��B\u0001\u0011��\u001C�o�`\"\u001Fj\u0000PF�ͫ�@�j�\u0012\u001E���ϫ��=�_=^\u001DE�\u000E\"b��e=Zj�����]�&!�HCw�\u0010Ld���3ђ\fl|���cĮ\u0011|��\n" +
//                "\u001F�J���V���\u001F_d\u0001\u001A7̣+�j{U�$�S'�\"^��\u001B����\"\u05FA�L�|�\u0015�l��f�C�\u0018�����u9\"�il��;ɶ���d�Fn2\u0003[\\E���g�l����i@�";
//        byte[] cipherByte = cipherText.getBytes();
//
//        cipher.init(Cipher.DECRYPT_MODE, pair.getPrivate());
//
//        byte[] decipheredText = cipher.doFinal(cipherByte);
//        System.out.println(new String(decipheredText));


public class cryptography {
    public static void main(String args[]) throws Exception {
        //Creating KeyPair generator object
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");

        //Initializing the key pair generator
        keyPairGen.initialize(2048);

        //Generate the pair of keys
        KeyPair pair = keyPairGen.generateKeyPair();

        //Getting the public key from the key pair
        PublicKey publicKey = pair.getPublic();

        //Creating a Cipher object
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");

        //Initializing a Cipher object
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);

        //Add data to the cipher
        byte[] input = "Welcome to Tutorialspoint".getBytes();
        cipher.update(input);

        //encrypting the data
        byte[] cipherText = cipher.doFinal();
        System.out.println("Printing encrypted text");
        System.out.println("In UTF or default format: " + new String(cipherText, "UTF8"));
        System.out.println("\nIn ASCII format: " + new String(cipherText, "ASCII"));

        //Initializing the same cipher for decryption
        cipher.init(Cipher.DECRYPT_MODE, pair.getPrivate());

        //Decrypting the text
        byte[] decipheredText = cipher.doFinal(cipherText);
        System.out.println(new String(decipheredText));
    }
}