import java.util.ArrayList;
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
        //newkey();
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
                    getClass();
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
    private void newkey() {
        System.out.println("Its working !!");
            
    }
    private void getkey() {
        
    }
    private void encrypt() {
        
    }
    private void decrypt() {
        
    }
    private void quit() {
        
    }
    
}
