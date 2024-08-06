package Cipher;

public class Cipher {

    String plainText;
    int key;

    Cipher(String plainText, int key){}

    String encryption(){

        String ans = "";
        for (int i = 0; i < plainText.length(); i++) {

            char in = (char)'3';
            ans = String.valueOf(plainText.charAt(i) + in);
        }
        return ans;
    }

    String Decryption(){
        String ans = "";
        for (int i = 0; i < plainText.length(); i++) {

            char in = (char)'3';
            ans = String.valueOf(plainText.charAt(i) - in);
        }
        return ans;
    }
}
