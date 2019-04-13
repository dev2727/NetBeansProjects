
package aesproject;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Encoder;
import sun.misc.BASE64Decoder;

/**
 *
 * @author anubhav chhillar
 */
public class AESAlgorithm {
    
    public static String algo  ="AES";
    public byte[] keyValue;
    
    public AESAlgorithm(String key){
      keyValue = key.getBytes();
  
          } AESAlgorithm(byte key[]) { 
        keyValue =key;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Key generateKey() throws Exception{
        Key key = new SecretKeySpec(keyValue,algo);
 return key;
    }
    public String encrypt(String msg) throws Exception{
        Key key = genereteKey();
        Cipher c = Cipher.getInstance(algo);
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[]encVal = c.doFinal(msg.getBytes());
        String encryptedValue = new BASE64Encoder().encode(encVal);
        return encryptedValue;
        
    }
    public String decrypt(String msg, String decValue) throws Exception {
      Key key = genereteKey();
        Cipher c = Cipher.getInstance(algo);
        c.init(Cipher.DECRYPT_MODE, key);
         byte[]  decryptedValue = new BASE64Decoder().decodeBuffer(msg);
        byte[] decVal = c.doFinal(msg.getBytes());
        String decptedValue =decValue;
        return decptedValue;
           
    }

    private Key genereteKey() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String decrypt(String msg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String decryt(String msg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
