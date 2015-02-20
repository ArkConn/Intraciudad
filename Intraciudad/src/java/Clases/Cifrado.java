/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//**
 *
 * @author Carlos Elliot
 */
package Clases;


import java.math.BigInteger;  
import java.security.MessageDigest;  
import java.security.NoSuchAlgorithmException;  
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;


public class Cifrado {
    
    
     public static String C_MD5(String Texto){  
      String sen = "";  
      @SuppressWarnings("UnusedAssignment")
      MessageDigest md = null;  
      try {  
         md = MessageDigest.getInstance("MD5");  
         BigInteger hash = new BigInteger(1, md.digest(Texto.getBytes()));  
         sen = hash.toString(16);           
      } catch (NoSuchAlgorithmException e) {  
          e.printStackTrace();  
       }       
      return sen;  
   }
         
     public static String C_SHA(String text2){  
      String sen = "";  
      @SuppressWarnings("UnusedAssignment")
      MessageDigest md = null;  
      try {  
         md = MessageDigest.getInstance("SHA-1");  
         BigInteger hash = new BigInteger(1, md.digest(text2.getBytes()));  
         sen = hash.toString(16);           
      } catch (NoSuchAlgorithmException e) {  
          e.printStackTrace();  
       }       
      return sen;
     }

     public static String Blow(String text2) throws Exception{
           
            KeyGenerator kg = KeyGenerator.getInstance("Blowfish");

            SecretKey llaveSecreta = kg.generateKey();
            Cipher cifra = Cipher.getInstance("Blowfish");

            String cifrado;

            cifra.init(Cipher.ENCRYPT_MODE, llaveSecreta);

            cifrado = text2;

            byte[] encriptado = cifra.doFinal(cifrado.getBytes());

            String lol = new String(encriptado);
            
            cifra.init(Cipher.DECRYPT_MODE, llaveSecreta);
            
            byte[] desencriptado = cifra.doFinal(encriptado);

           //JOptionPane.showMessageDialog (null,"mensaje descifrado:" +new String(desencriptado));
         return lol;
            
}
        
     public static String DeBlow(String text2) throws Exception{
           
            KeyGenerator kg = KeyGenerator.getInstance("Blowfish");

            SecretKey llaveSecreta = kg.generateKey();
            Cipher cifra = Cipher.getInstance("Blowfish");

            String cifrado;

            cifra.init(Cipher.ENCRYPT_MODE, llaveSecreta);

            cifrado = text2;

            byte[] encriptado = cifra.doFinal(cifrado.getBytes());

            
            cifra.init(Cipher.DECRYPT_MODE, llaveSecreta);
            
            byte[] desencriptado = cifra.doFinal(encriptado);

            String lol = new String(desencriptado);
         return lol;
            
}
      public static String AES(String texto){
          String llaveSimetrica = "jelouMoy touijos";
          String cifrado="";
        SecretKeySpec key = new SecretKeySpec(llaveSimetrica.getBytes(), "AES");
        Cipher cipher;
        try {
         cipher = Cipher.getInstance("AES");

         //Comienzo a encriptar
         cipher.init(Cipher.ENCRYPT_MODE, key);
         byte[] campoCifrado = cipher.doFinal(texto.getBytes());
         /*
          * TODO: Representar los bytes como string vía base64, así será
          * humanamente leíble. La otra opción es expresar como hexadecimal
          * 
          * En este caso lo imprimo en pantalla como bytes.-*/
         cifrado =  new String(campoCifrado);         
          } catch (Exception e) {
                e.printStackTrace();
            }
      return cifrado;
      }
            public static String D_AES(String texto){
          String llaveSimetrica = "jelouMoy touijos";
          String decifrado="";
        SecretKeySpec key = new SecretKeySpec(llaveSimetrica.getBytes(), "AES");
        Cipher cipher;
        try {
         cipher = Cipher.getInstance("AES");

         //Comienzo a encriptar
         cipher.init(Cipher.DECRYPT_MODE, key);
         byte[] campoCifrado = cipher.doFinal(texto.getBytes());
         /*
          * TODO: Representar los bytes como string vía base64, así será
          * humanamente leíble. La otra opción es expresar como hexadecimal
          * 
          * En este caso lo imprimo en pantalla como bytes.-*/
         decifrado =  new String(campoCifrado);         
          } catch (Exception e) {
                e.printStackTrace();
            }
      return decifrado;
      }
}
