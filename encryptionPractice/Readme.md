Java Cryptography
-----------------

1. Data decryption
2. Classes (methods): 
 - javax.crypto.Cipher (
   - getInstance(String - info. telling abt transformation and returns Cipher object)
   - init(ENCRYPT_MODE/DECRYPT_MODE, publickey)
   - update(byte[] - string to be encrypted converted to bytes)
   - doFinal() - completes the encryption process and returns encrypted data as byte[]
   - doFinal(byte[]) - completes the decryption process and returns decrypted data as byte[] 
 )
 - KeyPairGenerator ( 
   - getInstance(String - required key-generating algorithm, e.g., 'DSA', 'RSA')
   - initialize(int - key size, e.g., 2048)
   - generateKeyPair(to generate the pair of keys)
 )
 - java.security.KeyPair (
   - getPublic(to generate PublicKey object)
   - getPrivate()
 )

References: 
-----------
https://www.tutorialspoint.com/java_cryptography/java_cryptography_decrypting_data.htm#