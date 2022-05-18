package me.oliver;
import java.util.Scanner;
public class CaesarDecrypt {

    public static class CaesarCipherJava {
        public static void main(String...s){
            String message;
            StringBuilder decryptedMessage = new StringBuilder();
            int key;
            char ch;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a message: ");
            message = sc.nextLine();
            System.out.println("Enter key: ");
            key = sc.nextInt();

            for(int i = 0; i < message.length(); ++i){
                ch = message.charAt(i);
                if(ch >= 'a' && ch <= 'z'){
                    ch = (char)(ch - key);

                    if(ch < 'a'){
                        ch = (char)(ch + 'z' - 'a' + 1);
                    }

                    decryptedMessage.append(ch);
                }
                else if(ch >= 'A' && ch <= 'Z'){
                    ch = (char)(ch - key);

                    if(ch < 'A'){
                        ch = (char)(ch + 'Z' - 'A' + 1);
                    }

                    decryptedMessage.append(ch);
                }
                else {
                    decryptedMessage.append(ch);
                }
            }
            System.out.println("Decrypted Message = " + decryptedMessage);
        }
    }

}
