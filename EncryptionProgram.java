import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import javax.xml.transform.Source;

public class EncryptionProgram {
    private Scanner scanner;
    private Random random;
    private ArrayList<Character> list;
    private ArrayList<Character> shuffledList;
    private char characters;
    private String line;
    private char[] letters;
    private char[] secretLetters;


    


    EncryptionProgram(){

        scanner = new Scanner(System.in);
        random = new Random();
        list = new ArrayList();
        shuffledList = new ArrayList();
        characters = ' ';
        newkey();
        askquestion();


    }
    private void askquestion(){
        while(true){
            System.out.println("**********************************");
            System.out.println("What do you want to do? ");
            System.out.println("(N)ewKey, (G)etKey, (E)ncrypt, (D)ecrypt, (Q)uit ");
            char responce = Character.toUpperCase(scanner.nextLine().charAt(0));

            switch(responce){
                case 'N':
                    newkey();
                    break;
                case 'G':
                    getkey();
                    break;
                case 'E':
                    encrypt();
                    break;
                case 'D':
                    decrypt();
                    break;
                case 'Q':
                    quit();
                    break;
                default:
                    System.out.println("Please enter vaild key :( ");
            
            }
        }

    }

    //for generating new key
    private void newkey() {
        characters = ' ';
        list.clear();
        shuffledList.clear();

        for(int i=32; i<127; i++){
            list.add(Character.valueOf(characters));
            characters++;
        }
        shuffledList = new ArrayList<>(list);
        Collections.shuffle(shuffledList);
        System.out.println("New key has been generated*****");
    }
    private void getkey() {
        System.out.println("Key : ");
        for(Character v : list){
            System.out.print(v);
        }
        System.out.println();
        for(Character v : shuffledList){
            System.out.print(v);
        }
        System.out.println();
    }
    private void encrypt() {
        System.out.println("Enter your message to be Encrypted:  ");
        String message = scanner.nextLine();
        letters = message.toCharArray();

        for(int i=0; i<letters.length; i++){
            for(int j=0; j<list.size(); j++){
                if(letters[i]==list.get(j)){
                    letters[i]=shuffledList.get(j);
                    break;
                }
            }
        }
        System.out.println("Encrypted: ");
        for(char x : letters){
            System.out.print(x);

        }
        System.out.println();
        
    }
    private void decrypt() {
        System.out.println("Enter your message to be Decrypted: ");
        String message = scanner.nextLine();
        letters = message.toCharArray();

        for(int i=0; i<letters.length; i++){
            for(int j=0; j<shuffledList.size(); j++){
                if(letters[i]==shuffledList.get(j)){
                    letters[i]=list.get(j);
                    break;
                }
            }
        }
        System.out.println("Decrypted: ");
        for(char x : letters){
            System.out.print(x);

        }
        System.out.println();
        
    }
    private void quit() {
        System.out.println("Thank you!!");
        System.exit(0);
        
    }
    
}
