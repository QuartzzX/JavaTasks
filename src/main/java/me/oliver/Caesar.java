package me.oliver;
import java.util.Scanner;
class CaesarCipher
{
    public static class CaesarCipherJava {
        public static void main(String...s){
            String message;
            StringBuilder encryptedMessage = new StringBuilder();
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
                    ch = (char)(ch + key);

                    if(ch > 'z'){
                        ch = (char)(ch - 'z' + 'a' - 1);
                    }

                    encryptedMessage.append(ch);
                }
                else if(ch >= 'A' && ch <= 'Z'){
                    ch = (char)(ch + key);

                    if(ch > 'Z'){
                        ch = (char)(ch - 'Z' + 'A' - 1);
                    }

                    encryptedMessage.append(ch);
                }
                else {
                    encryptedMessage.append(ch);
                }
            }
            System.out.println("Encrypted Message = " + encryptedMessage);
        }
    }
}